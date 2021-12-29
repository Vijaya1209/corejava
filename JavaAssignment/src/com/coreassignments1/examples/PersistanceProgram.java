package com.coreassignments1.examples;

abstract class Persistence {

    abstract void persist();
}

class FilePersistence extends Persistence
{

    @Override
    void persist() {

        System.out.println(" Storing data in File ");
    }
}

class DatabasePersistence extends Persistence
{

    @Override
    void persist() {
        System.out.println(" Storing data in Database ");
    }
}

public class PersistanceProgram {

	public static void main(String[] args) throws ClassNotFoundException {

        Persistence client = new FilePersistence();
        client = new DatabasePersistence();
        Class a = Class.forName("FilePersistence");
        ClassLoader cLoader = a.getClassLoader();

        System.out.println(a.getName());
    }
}
