/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package console;

import java.io.IOException;

public interface Action {
    void execute() throws IOException;
}