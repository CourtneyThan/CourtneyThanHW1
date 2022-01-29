import java.util.*;
import java.lang.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


public class Prime extends Thread {
  static int num = 100000000;
  boolean []primeNums;
  int start;
  int end;
  ArrayList<Integer> list;
  AtomicInteger primes = new AtomicInteger();
  AtomicLong sum = new AtomicLong();

  public Prime(int start, int end, boolean []primeNums){
    this.start = start;
    this.end = end;
    this.primeNums = primeNums;
  }

  public void run(){
    for (int i = start; i < end; i++){
      if (primeNums[i] == true){
        primes.getAndIncrement();
        sum.getAndAdd(i);
      }
    }
  }
}
