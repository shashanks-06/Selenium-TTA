package Shashank.WebAutomation.Interview_Preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;


public class Practice {
    public static int[] removeDup(int[] array){
        int n = array.length;

        if (n == 0 || n == 1){
            return array;
        }

        int[] temp = new int[n];
        int index = 0;

        for (int k : array){
            boolean isDuplicate = false;

            for (int i = 0; i < index; i++) {

                if (k == temp[i]){
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate){
                temp[index++] = k;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4, 5};

        System.out.println(Arrays.toString(removeDup(array)));
    }


}
