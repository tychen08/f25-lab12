package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
    * Retrieves the books currently checked out by the specified user.
    * <p>
    * The user is identified by a {@code libraryId} (account identifier)
    * and a {@code userName} (the name under that account). Multiple
    * people in a household may share the same {@code libraryId}.
    *
    * @param libraryId the ID of the library account (must not be null or blank)
    * @param userName  the name of the user on that account (must not be null or blank)
    * @return an array of {@link Book} objects the user has checked out; empty if none
    * @throws IllegalArgumentException if {@code libraryId} or {@code userName} is null or blank
    */
    public Book[] getBooks(String libraryId, String userName) {
        if (libraryId == null || libraryId.isBlank())
            throw new IllegalArgumentException("libraryId cannot be null or blank");

        if (userName == null || userName.isBlank())
            throw new IllegalArgumentException("userName cannot be null or blank");
        
        return libraryService.getBooks(userName, libraryId);        
    }
}
