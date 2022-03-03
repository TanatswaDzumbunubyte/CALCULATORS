public class howmanycontainersforblocksneed {
    public static void main(String[] args) {
        //odd number of lego bricks
        int amountOfBricks,ContainerCapacity;

        //odd number of bricks
        amountOfBricks= 51;

        //even number for container capacity
        ContainerCapacity= 8;

        //calculation of how many containers unfilled
        int ContainersUnfilled = amountOfBricks % ContainerCapacity;
        System.out.println("The number of unfilled containers will be " + ContainersUnfilled);

        //calculation of filled containers
        int ContainersFilled = amountOfBricks / ContainerCapacity;
        System.out.printf("The number of filled containers will be " + ContainersFilled);

        //total of containers filled and not filled
        System.out.println(" ");
        int TotalContainers = ContainersFilled + ContainersUnfilled;
        System.out.printf("The total number of containers filled or unfilled is " + TotalContainers);



    }
}
