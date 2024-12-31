package com.example.quadraticequationsolver;


import android.view.View;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.example.quadraticequationsolver.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    private String a; // Coefficient 'a'
    private String b; // Coefficient 'b'
    private String c; // Coefficient 'c'
    private ActivityMainBinding binding; // Reference to the binding object

    // Constructor to initialize the binding object
    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    // Default constructor
    public MyEquation() {
    }

    // Getter and setter for 'a'
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    // Getter and setter for 'b'
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    // Getter and setter for 'c'
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    // Method to solve the quadratic equation
    public void solveEquation(View view) {
        try {
            // Convert input strings to integers
            int a = Integer.parseInt(getA());
            int b = Integer.parseInt(getB());
            int c = Integer.parseInt(getC());

            // Calculate the discriminant
            double discriminant = (b * b) - (4 * a * c);

            double x1, x2; // Variables to hold roots

            if (discriminant > 0) {
                // Two distinct real roots
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                binding.textView.setText("X1 = " + x1 + ", X2 = " + x2);
            } else if (discriminant < 0) {
                // Complex roots
                binding.textView.setText("No real roots (complex roots)");
            } else {
                // Single real root (double root)
                x1 = -b / (2.0 * a);
                binding.textView.setText("X = " + x1);
            }
        } catch (NumberFormatException e) {
            // Handle invalid input
            binding.textView.setText("Invalid input. Please enter valid integers.");
        }
    }
}
