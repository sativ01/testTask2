package ca.com.apigateway.testTask2;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sum {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private Integer sum;

    public Sum(){}

    public Sum(Integer a, Integer b) {
        this.sum = a + b;
    }

    public Sum(@JsonProperty("a") String a,
               @JsonProperty("b") String b) {
        this.sum = (Integer.parseInt(a) + Integer.parseInt(b));
    }

    public Integer getSum() {
        return this.sum;
    }
}
