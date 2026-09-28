package exercise04;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testUser() {

        String userName = "staffanPaffan";
        String password = "solemio";

        User user = new User(userName, password);
    }

    @Test
    public void testGetUserName() {

        //Arrange
        //Skapa ett objekt

        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Act
        //Hämta användarnamn
        String actual = user.getUserName();

        //Assert
        //Kontrollera att användarnamnet är korrekt

        assertEquals("staffanPaffan", actual);
        assertEquals(userName, actual);

    }

    @Test
    public void testGetPassword() {
        //Arrange
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);
        //Act
        //Hämta password
        String actual = user.getPassword();
        //Assert
        //Kontrollera att password är korrekt
        assertEquals("solemio", actual);
        assertEquals(password, actual);
    }

    @Test
    public void testSetUserName() {
        //Arrang
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);
        //Ändra användarnamn -> GrodanBoll
        String newUserName = "GrodanBoll";
        user.setUserName(newUserName);

        //Hämta användarnamn
        String actual =user.getUserName();

        //Assert
        //Kontrollera att användarnamn är korrekt
        //assertEquals("StaffanPaffan", actual);
        assertEquals(newUserName, actual);

    }

    @Test
    public void testUserNameNotShorterThan4() {
        //Arrang
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);
        //Ändra användarnamn -> lok
        String newUserName = "lok";
        user.setUserName(newUserName);

        //Hämta användarnamn
        String actual =user.getUserName();

        //Assert
        //Kontrollera att användarnamn är korrekt
        //assertEquals("StaffanPaffan", actual);
        assertEquals(userName, actual);

    }

    @Test
    public void testSetShortUserName() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra användarnamn -> GrodanBoll
        String newUserName = "lok";
        user.setUserName(newUserName);

        //Hämta användarnamn
        String actual = user.getUserName();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals("staffanPaffan", actual);
    }

    @Test
    public void testSetPassword7chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "kokos!n";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(newPassword, actual);
    }

    @Test
    public void testSetPassword20chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "hejarhejarhejarheja!";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(newPassword, actual);
    }

    @Test
    public void testSetPassword21chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "hejarhejarhejarhejare";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(password, actual);
    }

    @Test
    public void testSetPassword6chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "tangon";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(password, actual);
    }

    @Test
    public void testGetTypeOfUser() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String actual = user.getTypeOfUser();

        assertEquals("normal", actual);
    }

    @Test
    public void testSetTypeOfUser() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "onormal";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals("normal", actual);
    }

    @Test
    public void testSetTypeOfUserAdmin() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "admin";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }

    @Test
    public void testSetTypeOfUserSuper() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "super";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }


    @Test
    public void testSetTypeOfUserBackToNormal() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "admin";
        user.setTypeOfUser(newTypeOfUser);

        newTypeOfUser = "normal";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }

    @Test
    public void testSetPasswordWithSpecialCharacters() {
        //Arrange, Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        // Act, Ändra lösenord -> kokosen
        String newPassword = "kokosen!";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(newPassword, actual);
    }

    @Test
    public void testSetPasswordWithoutSpecialCharacters() {
        //Arrange, Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        // Act, Ändra lösenord -> kokosen
        String newPassword = "kokosen";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att lösenordet är korrekt
        assertEquals(password, actual);
    }



    //testfall 4



}

//datatyp       String
//variabelnamn  userName
//värde         "staffanPaffan"

//datatyp variabelnamn = värde;

//datatyp       String
//variabelnamn  password
//värde         "solemio"




