package week_9.assignment_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface SaverModeCapable {}

abstract class Appliance {
    private String type;
    private double powerWatts;

    public Appliance(String type, double powerWatts) {
        this.type = type;
        this.powerWatts = powerWatts;
    }

    public String getType() {
        return type;
    }

    public double calculateUnits(double hours, boolean isSaver) {
        double units = (powerWatts * hours) / 1000.0;
        if (isSaver) {
            units *= 0.75;
        }
        return units;
    }

    public double calculateCost(double units) {
        return units * 8.0;
    }
}

class Fridge extends Appliance {
    public Fridge() {
        super("FRIDGE", 150.0);
    }
}

class AC extends Appliance implements SaverModeCapable {
    public AC() {
        super("AC", 1500.0);
    }
}

class TV extends Appliance {
    public TV() {
        super("TV", 100.0);
    }
}

class Washer extends Appliance implements SaverModeCapable {
    public Washer() {
        super("WASHER", 500.0);
    }
}

class ApplianceUsageRequest {
    private Appliance appliance;
    private double hours;
    private boolean isSaverRequested;

    public ApplianceUsageRequest(Appliance appliance, double hours, boolean isSaverRequested) {
        this.appliance = appliance;
        this.hours = hours;
        this.isSaverRequested = isSaverRequested;
    }

    public Appliance getAppliance() {
        return appliance;
    }

    public double getHours() {
        return hours;
    }

    public boolean isSaverRequested() {
        return isSaverRequested;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int n = scanner.nextInt();
        scanner.nextLine();

        List<ApplianceUsageRequest> requests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String applianceType = parts[0];
            double hours = Double.parseDouble(parts[1]);
            boolean isSaver = parts.length > 2 && "SAVER".equalsIgnoreCase(parts[2]);

            Appliance appliance = null;
            switch (applianceType) {
                case "FRIDGE":
                    appliance = new Fridge();
                    break;
                case "AC":
                    appliance = new AC();
                    break;
                case "TV":
                    appliance = new TV();
                    break;
                case "WASHER":
                    appliance = new Washer();
                    break;
            }

            if (appliance != null) {
                requests.add(new ApplianceUsageRequest(appliance, hours, isSaver));
            }
        }

        double totalCost = 0;
        for (ApplianceUsageRequest req : requests) {
            Appliance appliance = req.getAppliance();

            if (req.isSaverRequested() && !(appliance instanceof SaverModeCapable)) {
                System.out.printf("%s: saver mode not supported\n", appliance.getType());
            } else {
                double units = appliance.calculateUnits(req.getHours(), req.isSaverRequested());
                double cost = appliance.calculateCost(units);
                totalCost += cost;

                System.out.printf("%s: Units=%.2f Cost=%.2f\n", appliance.getType(), units, cost);
            }
        }

        System.out.printf("Total Cost: %.2f\n", totalCost);
        scanner.close();
    }
}