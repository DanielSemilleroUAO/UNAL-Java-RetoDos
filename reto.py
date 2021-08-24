letras_c = ""
letras_f = ""
letras_puntos = ""
letras_f = input("Ingrese la letras: ")
letras_c = input("Ingrese la letras: ")
letras_puntos = input("Ingrese las letras de los puntos: ")
mensaje = ""
puntos_c = 0
puntos_f = 0
for i in letras_puntos:
  for c in letras_c:
    if(c == i):
      puntos_c += 1
      break
  for f in letras_f:
    if(f == i):
      puntos_f += 1
      break
  if(puntos_c > puntos_f):
    mensaje += "B"
  elif(puntos_f > puntos_c):
    mensaje += "A"
  else:
    mensaje += "E" 
print(mensaje)
