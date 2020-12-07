/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import context.Paper;
import state.PaperState;

/**
 *
 * @author Dusan
 */
public class PaperReviewProcess implements PaperState{
    private final Paper paper;
    
    public PaperReviewProcess() {
        paper=new Paper();
    }    
    
}
