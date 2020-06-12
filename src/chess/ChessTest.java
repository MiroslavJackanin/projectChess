package chess;

import static org.junit.jupiter.api.Assertions.*;

class ChessTest {
    Chess chess = new Chess();

    @org.junit.jupiter.api.Test
    void checkBishop() {
        assertTrue(chess.checkBishop("C1","D2"));
        assertTrue(chess.checkBishop("C1","2b"));
        assertTrue(chess.checkBishop("4d","1g"));
        assertTrue(chess.checkBishop("4d","8h"));
        assertTrue(chess.checkBishop("4d","7a"));
        assertTrue(chess.checkBishop("4d","1a"));
        assertTrue(chess.checkBishop("1f","2e"));
        assertTrue(chess.checkBishop("1f","2g"));
        assertTrue(chess.checkBishop("f1","6a"));
        assertTrue(chess.checkBishop("f1","3h"));
        assertTrue(chess.checkBishop("4e","8a"));
        assertTrue(chess.checkBishop("4e","7h"));

        assertFalse(chess.checkBishop("4e","6a"));
        assertFalse(chess.checkBishop("1c","3c"));
        assertFalse(chess.checkBishop("1c","5c"));
        assertFalse(chess.checkBishop("1c","7c"));
        assertFalse(chess.checkBishop("1f","3f"));
        assertFalse(chess.checkBishop("1f","5h"));

        assertFalse(chess.checkBishop("18","xxx"));
        assertFalse(chess.checkBishop("4f","@5"));
        assertFalse(chess.checkBishop("1wf","5h"));
        assertFalse(chess.checkBishop("9f","5h"));
        assertFalse(chess.checkBishop("9f",null));
        assertFalse(chess.checkBishop(null,"4g"));

    }

    @org.junit.jupiter.api.Test
    void checkKing() {
        assertTrue(chess.checkKing("e1","2f"));
        assertTrue(chess.checkKing("e1","2d"));
        assertTrue(chess.checkKing("e3","4d"));
        assertTrue(chess.checkKing("e3","4e"));
        assertTrue(chess.checkKing("e3","4f"));
        assertTrue(chess.checkKing("e3","3d"));
        assertTrue(chess.checkKing("e3","3f"));
        assertTrue(chess.checkKing("e3","2d"));
        assertTrue(chess.checkKing("e3","2e"));
        assertTrue(chess.checkKing("e3","3f"));
        assertTrue(chess.checkKing("e3","3f"));

        assertFalse(chess.checkKing("e3","5e"));
        assertFalse(chess.checkKing("e3","5f"));

        assertFalse(chess.checkBishop("18","xxx"));
        assertFalse(chess.checkBishop("4f","@5"));
        assertFalse(chess.checkBishop("1wf","5h"));
        assertFalse(chess.checkBishop("9f","5h"));
        assertFalse(chess.checkBishop("9f",null));
        assertFalse(chess.checkBishop(null,"4g"));

    }

    @org.junit.jupiter.api.Test
    void checkQueen() {
        assertTrue(chess.checkQueen("d1","d8"));
        assertTrue(chess.checkQueen("d1","1a"));
        assertTrue(chess.checkQueen("d1","1h"));
        assertTrue(chess.checkQueen("d1","4a"));
        assertTrue(chess.checkQueen("d1","5h"));
        assertTrue(chess.checkQueen("d4","4h"));
        assertTrue(chess.checkQueen("d4","4a"));
        assertTrue(chess.checkQueen("d4","1a"));
        assertTrue(chess.checkQueen("d4","7a"));
        assertTrue(chess.checkQueen("d4","8h"));
        assertTrue(chess.checkQueen("d4","1g"));
        assertTrue(chess.checkQueen("d4","1d"));
        assertTrue(chess.checkQueen("d4","8d"));

        assertFalse(chess.checkQueen("d4","f5"));
        assertFalse(chess.checkQueen("d4","h5"));
        assertFalse(chess.checkQueen("d4","c2"));
        assertFalse(chess.checkQueen("d4","2e"));
        assertFalse(chess.checkQueen("d4","6a"));

        assertFalse(chess.checkBishop("18","xxx"));
        assertFalse(chess.checkBishop("4f","@5"));
        assertFalse(chess.checkBishop("1wf","5h"));
        assertFalse(chess.checkBishop("9f","5h"));
        assertFalse(chess.checkBishop("9f",null));
        assertFalse(chess.checkBishop(null,"4g"));

    }

    @org.junit.jupiter.api.Test
    void checkRook() {
        assertTrue(chess.checkRook("d5","e5"));
        assertTrue(chess.checkRook("d5","f5"));
        assertTrue(chess.checkRook("d5","g5"));
        assertTrue(chess.checkRook("d5","h5"));
        assertTrue(chess.checkRook("d5","a5"));
        assertTrue(chess.checkRook("d5","b5"));
        assertTrue(chess.checkRook("d5","c5"));
        assertTrue(chess.checkRook("d5","d8"));
        assertTrue(chess.checkRook("d5","d7"));
        assertTrue(chess.checkRook("d5","d6"));
        assertTrue(chess.checkRook("d5","d4"));
        assertTrue(chess.checkRook("d5","d3"));
        assertTrue(chess.checkRook("d5","d2"));
        assertTrue(chess.checkRook("d5","d1"));

        assertFalse(chess.checkRook("d5","e8"));
        assertFalse(chess.checkRook("d5","h8"));
        assertFalse(chess.checkRook("d5","a8"));
        assertFalse(chess.checkRook("d5","d5"));
        assertFalse(chess.checkRook("d5","f1"));
        assertFalse(chess.checkRook("d5","f4"));
        assertFalse(chess.checkRook("d5","b4"));
        assertFalse(chess.checkRook("d5","g14"));
        assertFalse(chess.checkRook("d5",null));
        assertFalse(chess.checkRook("d5","d18"));
        assertFalse(chess.checkRook("d5","25"));
        assertFalse(chess.checkRook("d5","ff"));

        assertFalse(chess.checkBishop("18","xxx"));
        assertFalse(chess.checkBishop("4f","@5"));
        assertFalse(chess.checkBishop("1wf","5h"));
        assertFalse(chess.checkBishop("9f","5h"));
        assertFalse(chess.checkBishop("9f",null));
        assertFalse(chess.checkBishop(null,"4g"));

    }

    @org.junit.jupiter.api.Test
    void checkKnight() {
        assertTrue(chess.checkKnight("b1","3a"));
        assertTrue(chess.checkKnight("b1","3c"));
        assertTrue(chess.checkKnight("b1","2d"));
        assertTrue(chess.checkKnight("g1","3h"));
        assertTrue(chess.checkKnight("g1","3f"));
        assertTrue(chess.checkKnight("g1","2e"));
        assertTrue(chess.checkKnight("4e","2f"));
        assertTrue(chess.checkKnight("4e","2d"));
        assertTrue(chess.checkKnight("4e","6f"));
        assertTrue(chess.checkKnight("4e","6d"));
        assertTrue(chess.checkKnight("4e","5c"));
        assertTrue(chess.checkKnight("4e","5g"));
        assertTrue(chess.checkKnight("4e","3g"));
        assertTrue(chess.checkKnight("4e","3c"));

        assertFalse(chess.checkKnight("4e","5d"));
        assertFalse(chess.checkKnight("4e","5e"));
        assertFalse(chess.checkKnight("4e","5f"));
        assertFalse(chess.checkKnight("4e","6c"));
        assertFalse(chess.checkKnight("4e","6g"));
        assertFalse(chess.checkKnight("4e","1b"));
        assertFalse(chess.checkKnight("4e","1h"));

        assertFalse(chess.checkBishop("18","xxx"));
        assertFalse(chess.checkBishop("4f","@5"));
        assertFalse(chess.checkBishop("1wf","5h"));
        assertFalse(chess.checkBishop("9f","5h"));
        assertFalse(chess.checkBishop("9f",null));
        assertFalse(chess.checkBishop(null,"4g"));
    }
}