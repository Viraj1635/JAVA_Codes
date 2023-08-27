public class OrchardFarm {
    public static void main(String[] args) {
        int days = 365; // the number of days to simulate
        int maxPercentage = 40; // the maximum percentage of each tree type
        int totalTrees = 0;
        int totalIncome = 0;

        // define the trees
        Tree appleTree = new Tree("Apple", 400, 10, 5, 150);
        Tree orangeTree = new Tree("Orange", 280, 6, 7, 250);
        Tree mangoTree = new Tree("Mango", 2200, 15, 8, 100);
        Tree lemonTree = new Tree("Lemon", 1500, 5, 10, 50);
        Tree coconutTree = new Tree("Coconut", 75, 15, 15, 1600);

        // plant at least one of each tree type
        totalTrees += plantTree(appleTree, maxPercentage);
        totalTrees += plantTree(orangeTree, maxPercentage);
        totalTrees += plantTree(mangoTree, maxPercentage);
        totalTrees += plantTree(lemonTree, maxPercentage);
        totalTrees += plantTree(coconutTree, maxPercentage);

        // plant the remaining trees
        while (totalTrees < 100) {
            int random = (int) (Math.random() * 5) + 1;
            Tree tree = null;
            switch (random) {
                case 1:
                    tree = appleTree;
                    break;
                case 2:
                    tree = orangeTree;
                    break;
                case 3:
                    tree = mangoTree;
                    break;
                case 4:
                    tree = lemonTree;
                    break;
                case 5:
                    tree = coconutTree;
                    break;
            }
            totalTrees += plantTree(tree, maxPercentage);
        }

        // simulate the days and calculate the income
        for (int i = 0; i < days; i++) {
            totalIncome += harvest(appleTree);
            totalIncome += harvest(orangeTree);
            totalIncome += harvest(mangoTree);
            totalIncome += harvest(lemonTree);
            totalIncome += harvest(coconutTree);
        }

        System.out.println("Total income in " + days + " days: ₹" + totalIncome);
    }

    public static int plantTree(Tree tree, int maxPercentage) {
        int treesPlanted = 0;
        if (tree.getPercentage() < maxPercentage) {
            tree.setPercentage(tree.getPercentage() + 1);
            treesPlanted = 1;
        }
        return treesPlanted;
    }

    public static int harvest(Tree tree) {
        int income = 0;
        if (tree.isReady()) {
            int quantity = tree.getQuantity();
            income = (quantity / tree.getConversionRate()) * tree.getPrice();
            tree.reset();
        } else {
            tree.incrementDays();
        }
        return income;
    }
}

class Tree {
    private String name;
    private int quantity;
    private int growthTime;
    private int conversionRate;
    private int price;
    private int days;
    private int percentage;

    public Tree(String name, int quantity, int growthTime, int conversionRate, int price) {
        this.name = name;
        this.quantity = quantity;
        this.growthTime = growthTime;
        this.conversionRate = conversionRate;
        this.price = price;
        this.days = 0;
        this.percentage = 0;
    }

    public boolean isReady() {
        return days >= growthTime;
    }
}
