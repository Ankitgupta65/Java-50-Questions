public class file_size_finder {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "D:\\My java files"; 
        // Create a File object
        java.io.File file = new java.io.File(filePath);

        // Check if the file exists and print its size
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            System.out.println("File size: " + fileSizeInBytes + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}