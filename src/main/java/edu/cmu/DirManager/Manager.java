package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return true if the directory was created successfully, false if it already exists
     * @throws IllegalArgumentException if the path is null, empty, or invalid
     */
    public boolean newDirectory(String path) {
        if (path == null || path.isEmpty() || !dirOps.checkPathValid(path)) {
            throw new IllegalArgumentException("Path cannot be null, empty, or invalid string.");
        }
        if (dirOps.checkDirectoryExists(path)){
            return false;
        }
        dirOps.createDirectory(path);
        return true;
    }
}
