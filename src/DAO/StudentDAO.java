package DAO;

import model.StudentModel;

public interface StudentDAO {
    public abstract boolean create(StudentModel sm);
    
    public abstract boolean view(StudentModel sm);
    
    public abstract boolean select(StudentModel sm);
    
    public abstract boolean delet(StudentModel sm);
    
    public abstract boolean update(StudentModel sm);
    
    public abstract boolean edit(StudentModel sm);
}
