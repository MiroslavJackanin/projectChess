package chess;

public class Chess {
    public String normalize(String position){
        if(position==null || position.length()!=2 )
            return null;

        StringBuilder pos = new StringBuilder(position.toUpperCase());
        char temp;
        if ((int)pos.charAt(0) > 48 && (int)pos.charAt(0) < 57 && (int)pos.charAt(1) > 48 && (int)pos.charAt(1) < 57){
            return null;
        }else if ((int)pos.charAt(0) > 64 && (int)pos.charAt(0) < 73 && (int)pos.charAt(1) > 64 && (int)pos.charAt(1) < 73){
            return null;
        }else if ((int)pos.charAt(0) > 48 && (int)pos.charAt(0) < 57){
            temp = pos.charAt(1);
            pos.setCharAt(1, pos.charAt(0));
            pos.setCharAt(0, temp);
        }
        return pos.toString();
    }

    public boolean checkBishop(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            return false;
        }
        if (pos.equals(dest)){
            return false;
        }
        if (Math.abs(pos.charAt(0)-dest.charAt(0))==Math.abs(pos.charAt(1) -dest.charAt(1))){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkKing(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            return false;
        }
        if (pos.equals(dest)){
            return false;
        }
        return Math.abs(pos.charAt(0) - dest.charAt(0)) <= Math.abs(1) && Math.abs(pos.charAt(1) - dest.charAt(1)) <= Math.abs(1);
    }

    public boolean checkQueen(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            return false;
        }
        if (pos.equals(dest)){
            return false;
        }
        return Math.abs(pos.charAt(0) - dest.charAt(0)) == Math.abs(pos.charAt(1) - dest.charAt(1))
                || (pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1));
    }

    public boolean checkRook(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            return false;
        }
        if (pos.equals(dest)){
            return false;
        }
        return pos.charAt(0) == dest.charAt(0) || pos.charAt(1) == dest.charAt(1);
    }

    public boolean checkKnight(String pos, String dest){
        pos=normalize(pos);
        dest=normalize(dest);
        if (pos==null|| dest==null){
            return false;
        }
        if (pos.equals(dest)){
            return false;
        }
        int i = Math.abs(pos.charAt(0) - dest.charAt(0));
        int j = Math.abs(pos.charAt(1) - dest.charAt(1));
        return (i == 1 && j == 2) || (i == 2 && j == 1);
    }
}
