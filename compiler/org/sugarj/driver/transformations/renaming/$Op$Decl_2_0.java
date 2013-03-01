package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl_2_0 extends Strategy 
{ 
  public static $Op$Decl_2_0 instance = new $Op$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_47, Strategy v_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDecl_2_0");
    Fail354:
    { 
      IStrategoTerm e_195 = null;
      IStrategoTerm c_195 = null;
      IStrategoTerm d_195 = null;
      IStrategoTerm f_195 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail354;
      c_195 = term.getSubterm(0);
      d_195 = term.getSubterm(1);
      IStrategoList annos298 = term.getAnnotations();
      e_195 = annos298;
      term = u_47.invoke(context, c_195);
      if(term == null)
        break Fail354;
      f_195 = term;
      term = v_47.invoke(context, d_195);
      if(term == null)
        break Fail354;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOpDecl_2, new IStrategoTerm[]{f_195, term}), checkListAnnos(termFactory, e_195));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}