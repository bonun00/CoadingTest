def solution(lines):
    points = []
    
    for start, end in lines:
        points.append((start, 1))  
        points.append((end, -1))   
    
    points.sort()
    
    overlap_length = 0
    active_segments = 0
    last_point = None
    
    for point, delta in points:
        if active_segments >= 2 and last_point is not None:
            overlap_length += point - last_point
        
        active_segments += delta
        last_point = point
    
    return overlap_length

lines = [[0, 2], [-3, -1], [-2, 1]]
print(solution(lines)) 
