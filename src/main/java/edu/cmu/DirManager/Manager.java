package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;
    
    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @return 0 if the directory creation was successful
     *        -1 if the directory already exists,
     *        -2 if the path is invalid
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
