/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.simplemvc;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lendle
 */
public class Student {
    private String id, name;
    private double score=-1;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score=score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    private static Map<String, Student> db=new HashMap<>();
    
    static{
        db.put("id1", new Student("id1", "name1", 60));
        db.put("id2", new Student("id2", "name2", 50));
        db.put("id3", new Student("id3", "name3", 80));
    }
    
    public static Student getStudent(String id){
        return db.get(id);
    }
}
