grammar corchetes;

multi       : ciclobase+;
ciclobase   : base+ COMA*;
base        : OPEN VNUMBERSC* CLOSE*;

VNUMBERSC: NUMBER COMA*;
OPEN    : '['+;
CLOSE   : ']'+;
NUMBER  : [0-9]+;
COMA    : ',';       
WS      :[ \t\n\r]->skip;