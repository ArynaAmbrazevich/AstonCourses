public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class Attraction {
        private String attractionName;
        private String operationPeriod;
        private double cost;

        public Attraction(String attractionName, String operationPeriod, double cost) {
            this.attractionName = attractionName;
            this.operationPeriod = operationPeriod;
            this.cost = cost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getOperationPeriod() {
            return operationPeriod;
        }

        public double getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return "Attraction{name='" + attractionName + "', period='" + operationPeriod + "', cost=$" + cost + "}";
        }
    }
}
