package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class myfoldr1_3_0 extends Strategy 
{ 
  public static myfoldr1_3_0 instance = new myfoldr1_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_50, Strategy w_50, Strategy x_50)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("myfoldr1_3_0");
    Fail9:
    { 
      IStrategoTerm t_50 = null;
      IStrategoTerm u_50 = null;
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail10:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail10;
          { 
            term = v_50.invoke(context, term);
            if(term == null)
              break Fail9;
            if(true)
              break Success4;
          }
        }
        term = term4;
        IStrategoTerm term5 = term;
        Success5:
        { 
          Fail11:
          { 
            IStrategoTerm y_50 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail11;
            y_50 = ((IStrategoList)term).head();
            IStrategoTerm arg9 = ((IStrategoList)term).tail();
            if(arg9.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg9).isEmpty())
              break Fail11;
            term = y_50;
            { 
              term = w_50.invoke(context, term);
              if(term == null)
                break Fail9;
              if(true)
                break Success5;
            }
          }
          term = term5;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail9;
          t_50 = ((IStrategoList)term).head();
          u_50 = ((IStrategoList)term).tail();
          term = this.invoke(context, u_50, v_50, w_50, x_50);
          if(term == null)
            break Fail9;
          term = termFactory.makeTuple(t_50, term);
          term = x_50.invoke(context, term);
          if(term == null)
            break Fail9;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}