#exemples

Z1=[sqrt(3)/2, -1/2] #Représente le nombre complexe z1=sqrt(3)/2+i(-1/2)
Z2=[1/2, sqrt(3)/2] #Représente le nombre complexe z2=1/2+isqrt(3)/2
Z3=[0, 1] #Représente le nombre complexe i

def partieReelle_car(z) : 
    return z[0]
	

	
def partieImaginaire_car(z) : 
    return z[1]


	
def printZ_car(z, precision=2) : 
    x=round(partieReelle_car(z), precision)
    y=round(partieImaginaire_car(z), precision)
    
    txt=""
    if(x==0 and y==0) : txt=0
    
    if(x!=0) : txt+=str(x)
    if(y>0 and x!=0) : txt+='+'
    if(abs(y)!=1 and y!=0) : txt+=str(y)
    if(y==-1) : txt+='-'
    if(y!=0) : txt+='i'
        
    print(txt)
	
	
def addZ_car(z1, z2) : 
    real=partieReelle_car(z1)+partieReelle_car(z2)
    unreal=partieImaginaire_car(z1)+partieImaginaire_car(z2)
    
    return [real, unreal]
	
	
def oppZ_car(z) : 
        real=z[0]=-z[0]
        unreal=z[1]=-z[1]
        return [real,unreal]
	
	
def sousZ_car(z1, z2) : 
    real=z1[0]+oppZ_car(z2)[0]
    unreal=z1[1]+oppZ_car(z2)[1]
    return [real,unreal]
	
	
def multZ_car(z1, z2) :
    real=z1[0]*z2[0]-z1[1]*z2[1]
    unreal=z1[0]*z2[1]-z1[1]*z2[0]
    return [real, unreal]
	
	
def invZ_car(z) : 
    D=z[0]**2 + z[1]**2
    real=z[0]/D
    unreal=-z[1]/D
    

    return [-real, -unreal]
	
	
def divZ_car(z1, z2) : 
    D=z2[0]**2 + z2[1]**2
    
    real=(z1[0]*z2[0] + z1[1]*z2[1])   / D
    unreal=(z1[1]*z2[0] - z1[0]*z2[1])   / D
    

    return [real, unreal]