def BubbleSort(arr, n):

    for i in range (1, n):

        for j in range(n-i):

            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    
    print(arr)

arr = [4, 1, 8, 2, 3, 5, 0]
BubbleSort(arr,len(arr))