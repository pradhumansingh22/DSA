def Selection_sort(arr, n):
    for i in range (n-1):
        minIdx = i

        for j in range (i+1, n):
            if arr[j]<arr[minIdx]:
                minIdx = j
        
        arr[i], arr[minIdx] = arr[minIdx], arr[i]

    print(arr)

arr = [2, 5, 3, 6, 1]
Selection_sort(arr, len(arr))