package fr.svivien.cgbenchmark.model.request.play;

import java.util.List;

/**
 * Response for a PLAY in the CG IDE
 */
public class PlayResponse {
    public PlayResponseSuccess success;
    public Error error;

    public class Error {
        public int id;
        public int line;
        public String type;
        public String message;
    }

    public class Frame {
        public int agentId;
        public String gameInformation;
        public String summary;
        public String stdout;
        public String stderr;
        public Error error;
    }

    public class Tooltip {
        public int turn;
        public String text;
        public int event;
    }

    public class PlayResponseSuccess {
        public List<Integer> scores;
        public List<Frame> frames;
        public List<String> tooltips;
        public long gameId;
    }
}
