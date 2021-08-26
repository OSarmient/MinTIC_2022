#Devuelve la lista sin elementos repetidos
def categorias_repuestos(cat):
    salida = []
    for n in cat:
        if(not n in salida):
            salida.append(n)
    return salida

#Devuelve el indice en el cual un elemeno se ecuentra con respecto a una lista en unos indices ya dados
def faltan_por_categoria(codigos, categorias, categoria): 
    salida = []
    for i in codigos:
        for n in range(len(categorias)):
            if(categorias[n] == categoria):
                if(n == i):
                    salida.append(n)
    return salida
        
#Retorna los elemntos de una lista que no estan en otra en una nueva lista 
def repuesto_no_existe(codigos1, codigos2):
    salida = []
    for n in codigos1:
        if(not n in codigos2):
            salida.append(n)
    return salida

#
def cambiar_repuestos(codigo1, codigo2):
    capacidad = 0
    if(len(codigo1) <= len(codigo2)):
        for n in codigo1:
            if(not n in codigo2):
                capacidad += 1
    else:
        for i in codigo2:
            if(not i in codigo1):
                capacidad += 1
    return capacidad

print(faltan_por_categoria([7, 43, 38, 45, 20, 33, 30, 16, 28, 14, 19, 4, 15, 6, 37, 12, 9, 2, 49],
                            [5, 6, 4, 9, 6, 9, 9, 1, 1, 6, 6, 7, 2, 2, 3, 3, 3, 6, 9, 3, 2, 4, 7, 6, 7, 3, 9, 6, 7, 1, 8, 3, 8, 8, 2, 4, 4, 7, 8, 8, 5, 4, 8, 6, 8, 3, 2, 1, 2, 9],
                            3))
print(faltan_por_categoria([1,3,6,8], ['motor','lubricantes','suspencion','suspencion','suspencion','motor','lubricantes','suspencion','suspencion','suspencion'],'suspencion'))
