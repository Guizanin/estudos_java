
/*
* POR TER UM METODO ABRASTRATO
* CADA INDICE DO ENUM DEVE IMPLEMENTAR ELE
* MINHA IDEIA É DEIXAR PARECIDO COM UM OBJETO LITERAL UTILIZADO EM JAVASCRIPT
*
 */

import java.util.Objects;

public enum Enum {
    METHOD_1{
        @Override
        public String HandleMethod(int positionEnum, Object anything){
            var nextEnum = positionEnum + 1;

            if(Objects.isNull(anything)){
                return "fim metodo 1";
            }
            return Enum.valueOf("METHOD_".concat(String.valueOf(nextEnum))).HandleMethod(nextEnum,
                    "texto qualquer");
        }
    },
    METHOD_2{
        @Override
        public String HandleMethod(int positionEnum, Object anything){
            if(Objects.isNull(positionEnum)){
                return anything.toString().concat(" metodo 2");
            }

            return "fim";
        }
    };


    public abstract String HandleMethod(int positionEnum, Object anything);
}
