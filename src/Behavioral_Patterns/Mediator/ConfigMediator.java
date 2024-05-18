package Behavioral_Patterns.Mediator;

import java.util.Stack;

public class ConfigMediator implements Mediator {
    private Stack<Plane> runway = new Stack<>();
    private final long RUNWAY_USAGE_TIMEOUT = 10000; // 10 seconds

    public ConfigMediator() {
        new Thread(() -> {
            try {
                Thread.sleep(RUNWAY_USAGE_TIMEOUT);
                popRunway();
            } catch (InterruptedException ignored) {}
        }).start();
    }

    private synchronized void popRunway() {
        if (!runway.isEmpty()) {
            runway.pop();
        }
    }

    @Override
    public synchronized boolean response(Plane sender) {
        if (runway.empty()) {
            // If the runway is empty, allow the plane to use it
            runway.add(sender);
            return true;
        } else {
            // If the runway is not empty, check if it's already occupied by the sender
            if (runway.contains(sender)) {
                // Allow the sender to continue using the runway
                return true;
            } else {
                // If the runway is occupied by another plane, deny access
                return false;
            }
        }
    }
}
