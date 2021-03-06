/*
 * Copyright (C) 2012 Sony Mobile Communications AB
 *
 * This file is part of XAppDbg.
 *
 * XAppDbg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * XAppDbg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with XAppDbg.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sonymobile.tools.xappdbg;

import java.io.IOException;

/**
 * A XAppDbgCommand handles one specific type of command from the client.
 * For example listing the available flags.
 */
public abstract class XAppDbgCommand {

    private String mID;

    public XAppDbgCommand(String id) {
        mID = id;
    }

    public String getID() {
        return mID;
    }

    public abstract boolean exec(Packet in, Packet out) throws IOException;

}
