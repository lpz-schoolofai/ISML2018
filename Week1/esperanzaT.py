x_tuplas = [(1,0.2), (2, 0.3), (3,0.1), (4, 0.4)]

def esperanzaT(x_tuplas):
    E=0
    for x, P_x in x_tuplas:
        E +=  x*P_x
    return E

esperanzaT(x_tuplas)