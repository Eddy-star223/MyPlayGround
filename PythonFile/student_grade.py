passes = 0
failures = 0

for student in range(0, 10):

  result = int(input('Enter 1-pass or 2-fail: '))

  if result == 1:
    passes += 1
  
  elif result == 2:
    failures += 1

  elif result != 1 or result != 2:
    print('Invalid... Enter 1-pass or 2-fail')

print('The total pass is: ', passes)
print('The total fail is: ', failures)

if passes > 8:
  print('Bonus to instructor')
 