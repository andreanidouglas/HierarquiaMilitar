atiradorElite(andreaniDouglas).
dificuldade(facil).
dificuldade(medio).
dificuldade(dificil).
requisitos(X, Y):-atiradorElite(X),Y == 'atiradorElite';(soldadoElite(X), Y == 'soldadoElite');(pilotoAviao(X), Y == 'pilotoAviao');(pilotoHelicoptero(X), Y == 'pilotoHelicoptero');veiculos(X,K), nth0(Zindex,Klist,Y), Z > 0.
