# [22,27,16,2,18,6] -> Insertion Sort

### 1 - Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
  
  n0: [22,27,16,2,18,6]
  n1: [2,27,16,22,18,6]
  n2: [2,6,16,22,18,27]
  n3: [2,6,16,18,22,27] 

### 2 - Big-O gösterimini yazınız.

   O(n^2)
   
### 3 - Time Complexity: Average case: Aradığımız sayının ortada olması,
### 3 - Worst case: Aradığımız sayının sonda olması, 
### 3 - Best case: Aradığımız sayının dizinin en başında olması.

   Average Case : 16,18 
   Worst Case : 27  
   Best Case : 2
   
### 4 - Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
    18 diznin ortasında olduğu için: 
    "Average" Case olamlıdır


#### 4.1 - [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

n0- [7,3,5,8,2,9,4,15,6]
n1- [2,3,5,8,7,9,4,15,6]
n2- [2,3,4,8,7,9,5,15,6]
n3- [2,3,4,5,7,9,8,15,6]
n4- [2,3,4,5,6,9,8,15,7]