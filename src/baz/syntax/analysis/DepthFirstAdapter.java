/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.analysis;

import java.util.*;
import baz.syntax.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PFunc> copy = new ArrayList<PFunc>(node.getFuncs());
            for(PFunc e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outAProgram(node);
    }

    public void inAFunc(AFunc node)
    {
        defaultIn(node);
    }

    public void outAFunc(AFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunc(AFunc node)
    {
        inAFunc(node);
        if(node.getFun() != null)
        {
            node.getFun().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getParams() != null)
        {
            node.getParams().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getReturnType() != null)
        {
            node.getReturnType().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outAFunc(node);
    }

    public void inAParams(AParams node)
    {
        defaultIn(node);
    }

    public void outAParams(AParams node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParams(AParams node)
    {
        inAParams(node);
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        {
            List<PAdditionalParam> copy = new ArrayList<PAdditionalParam>(node.getAdditionalParams());
            for(PAdditionalParam e : copy)
            {
                e.apply(this);
            }
        }
        outAParams(node);
    }

    public void inAAdditionalParam(AAdditionalParam node)
    {
        defaultIn(node);
    }

    public void outAAdditionalParam(AAdditionalParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditionalParam(AAdditionalParam node)
    {
        inAAdditionalParam(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getParam() != null)
        {
            node.getParam().apply(this);
        }
        outAAdditionalParam(node);
    }

    public void inAParam(AParam node)
    {
        defaultIn(node);
    }

    public void outAParam(AParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParam(AParam node)
    {
        inAParam(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAParam(node);
    }

    public void inAReturnType(AReturnType node)
    {
        defaultIn(node);
    }

    public void outAReturnType(AReturnType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnType(AReturnType node)
    {
        inAReturnType(node);
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAReturnType(node);
    }

    public void inABoolType(ABoolType node)
    {
        defaultIn(node);
    }

    public void outABoolType(ABoolType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        inABoolType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolType(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringType(node);
    }

    public void inABlock(ABlock node)
    {
        defaultIn(node);
    }

    public void outABlock(ABlock node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlock(ABlock node)
    {
        inABlock(node);
        if(node.getLBrace() != null)
        {
            node.getLBrace().apply(this);
        }
        {
            List<PInst> copy = new ArrayList<PInst>(node.getInsts());
            for(PInst e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrace() != null)
        {
            node.getRBrace().apply(this);
        }
        outABlock(node);
    }

    public void inADeclarationInst(ADeclarationInst node)
    {
        defaultIn(node);
    }

    public void outADeclarationInst(ADeclarationInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationInst(ADeclarationInst node)
    {
        inADeclarationInst(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outADeclarationInst(node);
    }

    public void inAExpInst(AExpInst node)
    {
        defaultIn(node);
    }

    public void outAExpInst(AExpInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpInst(AExpInst node)
    {
        inAExpInst(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAExpInst(node);
    }

    public void inAIfInst(AIfInst node)
    {
        defaultIn(node);
    }

    public void outAIfInst(AIfInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfInst(AIfInst node)
    {
        inAIfInst(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        if(node.getElsePart() != null)
        {
            node.getElsePart().apply(this);
        }
        outAIfInst(node);
    }

    public void inAWhileInst(AWhileInst node)
    {
        defaultIn(node);
    }

    public void outAWhileInst(AWhileInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileInst(AWhileInst node)
    {
        inAWhileInst(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outAWhileInst(node);
    }

    public void inAPrintInst(APrintInst node)
    {
        defaultIn(node);
    }

    public void outAPrintInst(APrintInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintInst(APrintInst node)
    {
        inAPrintInst(node);
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAPrintInst(node);
    }

    public void inAReturnInst(AReturnInst node)
    {
        defaultIn(node);
    }

    public void outAReturnInst(AReturnInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnInst(AReturnInst node)
    {
        inAReturnInst(node);
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAReturnInst(node);
    }

    public void inABlockInst(ABlockInst node)
    {
        defaultIn(node);
    }

    public void outABlockInst(ABlockInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockInst(ABlockInst node)
    {
        inABlockInst(node);
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outABlockInst(node);
    }

    public void inAElsePart(AElsePart node)
    {
        defaultIn(node);
    }

    public void outAElsePart(AElsePart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElsePart(AElsePart node)
    {
        inAElsePart(node);
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        outAElsePart(node);
    }

    public void inAAssignExp(AAssignExp node)
    {
        defaultIn(node);
    }

    public void outAAssignExp(AAssignExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignExp(AAssignExp node)
    {
        inAAssignExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAssignExp(node);
    }

    public void inASimpleExp(ASimpleExp node)
    {
        defaultIn(node);
    }

    public void outASimpleExp(ASimpleExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleExp(ASimpleExp node)
    {
        inASimpleExp(node);
        if(node.getChoice() != null)
        {
            node.getChoice().apply(this);
        }
        outASimpleExp(node);
    }

    public void inAOrChoice(AOrChoice node)
    {
        defaultIn(node);
    }

    public void outAOrChoice(AOrChoice node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrChoice(AOrChoice node)
    {
        inAOrChoice(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOrChoice(node);
    }

    public void inASimpleChoice(ASimpleChoice node)
    {
        defaultIn(node);
    }

    public void outASimpleChoice(ASimpleChoice node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleChoice(ASimpleChoice node)
    {
        inASimpleChoice(node);
        if(node.getConjunction() != null)
        {
            node.getConjunction().apply(this);
        }
        outASimpleChoice(node);
    }

    public void inAAndConjunction(AAndConjunction node)
    {
        defaultIn(node);
    }

    public void outAAndConjunction(AAndConjunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndConjunction(AAndConjunction node)
    {
        inAAndConjunction(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAndConjunction(node);
    }

    public void inASimpleConjunction(ASimpleConjunction node)
    {
        defaultIn(node);
    }

    public void outASimpleConjunction(ASimpleConjunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleConjunction(ASimpleConjunction node)
    {
        inASimpleConjunction(node);
        if(node.getEquality() != null)
        {
            node.getEquality().apply(this);
        }
        outASimpleConjunction(node);
    }

    public void inAEqEquality(AEqEquality node)
    {
        defaultIn(node);
    }

    public void outAEqEquality(AEqEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqEquality(AEqEquality node)
    {
        inAEqEquality(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqEquality(node);
    }

    public void inANeqEquality(ANeqEquality node)
    {
        defaultIn(node);
    }

    public void outANeqEquality(ANeqEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeqEquality(ANeqEquality node)
    {
        inANeqEquality(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANeqEquality(node);
    }

    public void inASimpleEquality(ASimpleEquality node)
    {
        defaultIn(node);
    }

    public void outASimpleEquality(ASimpleEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleEquality(ASimpleEquality node)
    {
        inASimpleEquality(node);
        if(node.getRelative() != null)
        {
            node.getRelative().apply(this);
        }
        outASimpleEquality(node);
    }

    public void inALtRelative(ALtRelative node)
    {
        defaultIn(node);
    }

    public void outALtRelative(ALtRelative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtRelative(ALtRelative node)
    {
        inALtRelative(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getLt() != null)
        {
            node.getLt().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALtRelative(node);
    }

    public void inALteqRelative(ALteqRelative node)
    {
        defaultIn(node);
    }

    public void outALteqRelative(ALteqRelative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteqRelative(ALteqRelative node)
    {
        inALteqRelative(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getLteq() != null)
        {
            node.getLteq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALteqRelative(node);
    }

    public void inAGtRelative(AGtRelative node)
    {
        defaultIn(node);
    }

    public void outAGtRelative(AGtRelative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtRelative(AGtRelative node)
    {
        inAGtRelative(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getGt() != null)
        {
            node.getGt().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGtRelative(node);
    }

    public void inAGteqRelative(AGteqRelative node)
    {
        defaultIn(node);
    }

    public void outAGteqRelative(AGteqRelative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteqRelative(AGteqRelative node)
    {
        inAGteqRelative(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getGteq() != null)
        {
            node.getGteq().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGteqRelative(node);
    }

    public void inASimpleRelative(ASimpleRelative node)
    {
        defaultIn(node);
    }

    public void outASimpleRelative(ASimpleRelative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleRelative(ASimpleRelative node)
    {
        inASimpleRelative(node);
        if(node.getAdditive() != null)
        {
            node.getAdditive().apply(this);
        }
        outASimpleRelative(node);
    }

    public void inAAddAdditive(AAddAdditive node)
    {
        defaultIn(node);
    }

    public void outAAddAdditive(AAddAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddAdditive(AAddAdditive node)
    {
        inAAddAdditive(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAddAdditive(node);
    }

    public void inASubAdditive(ASubAdditive node)
    {
        defaultIn(node);
    }

    public void outASubAdditive(ASubAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubAdditive(ASubAdditive node)
    {
        inASubAdditive(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASubAdditive(node);
    }

    public void inASimpleAdditive(ASimpleAdditive node)
    {
        defaultIn(node);
    }

    public void outASimpleAdditive(ASimpleAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleAdditive(ASimpleAdditive node)
    {
        inASimpleAdditive(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outASimpleAdditive(node);
    }

    public void inAMulFactor(AMulFactor node)
    {
        defaultIn(node);
    }

    public void outAMulFactor(AMulFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMulFactor(AMulFactor node)
    {
        inAMulFactor(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getStar() != null)
        {
            node.getStar().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMulFactor(node);
    }

    public void inADivFactor(ADivFactor node)
    {
        defaultIn(node);
    }

    public void outADivFactor(ADivFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivFactor(ADivFactor node)
    {
        inADivFactor(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getSlash() != null)
        {
            node.getSlash().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivFactor(node);
    }

    public void inAModFactor(AModFactor node)
    {
        defaultIn(node);
    }

    public void outAModFactor(AModFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModFactor(AModFactor node)
    {
        inAModFactor(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getPercent() != null)
        {
            node.getPercent().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModFactor(node);
    }

    public void inASimpleFactor(ASimpleFactor node)
    {
        defaultIn(node);
    }

    public void outASimpleFactor(ASimpleFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleFactor(ASimpleFactor node)
    {
        inASimpleFactor(node);
        if(node.getUnary() != null)
        {
            node.getUnary().apply(this);
        }
        outASimpleFactor(node);
    }

    public void inAPosUnary(APosUnary node)
    {
        defaultIn(node);
    }

    public void outAPosUnary(APosUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPosUnary(APosUnary node)
    {
        inAPosUnary(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getUnary() != null)
        {
            node.getUnary().apply(this);
        }
        outAPosUnary(node);
    }

    public void inANegUnary(ANegUnary node)
    {
        defaultIn(node);
    }

    public void outANegUnary(ANegUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegUnary(ANegUnary node)
    {
        inANegUnary(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getUnary() != null)
        {
            node.getUnary().apply(this);
        }
        outANegUnary(node);
    }

    public void inANotUnary(ANotUnary node)
    {
        defaultIn(node);
    }

    public void outANotUnary(ANotUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotUnary(ANotUnary node)
    {
        inANotUnary(node);
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getUnary() != null)
        {
            node.getUnary().apply(this);
        }
        outANotUnary(node);
    }

    public void inASimpleUnary(ASimpleUnary node)
    {
        defaultIn(node);
    }

    public void outASimpleUnary(ASimpleUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleUnary(ASimpleUnary node)
    {
        inASimpleUnary(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outASimpleUnary(node);
    }

    public void inAVarTerm(AVarTerm node)
    {
        defaultIn(node);
    }

    public void outAVarTerm(AVarTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarTerm(AVarTerm node)
    {
        inAVarTerm(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVarTerm(node);
    }

    public void inANumTerm(ANumTerm node)
    {
        defaultIn(node);
    }

    public void outANumTerm(ANumTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumTerm(ANumTerm node)
    {
        inANumTerm(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumTerm(node);
    }

    public void inAStringTerm(AStringTerm node)
    {
        defaultIn(node);
    }

    public void outAStringTerm(AStringTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTerm(AStringTerm node)
    {
        inAStringTerm(node);
        if(node.getStringLiteral() != null)
        {
            node.getStringLiteral().apply(this);
        }
        outAStringTerm(node);
    }

    public void inATrueTerm(ATrueTerm node)
    {
        defaultIn(node);
    }

    public void outATrueTerm(ATrueTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueTerm(ATrueTerm node)
    {
        inATrueTerm(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueTerm(node);
    }

    public void inAFalseTerm(AFalseTerm node)
    {
        defaultIn(node);
    }

    public void outAFalseTerm(AFalseTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseTerm(AFalseTerm node)
    {
        inAFalseTerm(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseTerm(node);
    }

    public void inAParTerm(AParTerm node)
    {
        defaultIn(node);
    }

    public void outAParTerm(AParTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParTerm(AParTerm node)
    {
        inAParTerm(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAParTerm(node);
    }

    public void inACallTerm(ACallTerm node)
    {
        defaultIn(node);
    }

    public void outACallTerm(ACallTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallTerm(ACallTerm node)
    {
        inACallTerm(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArgs() != null)
        {
            node.getArgs().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outACallTerm(node);
    }

    public void inAArgs(AArgs node)
    {
        defaultIn(node);
    }

    public void outAArgs(AArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArgs(AArgs node)
    {
        inAArgs(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PAdditionalArg> copy = new ArrayList<PAdditionalArg>(node.getAdditionalArgs());
            for(PAdditionalArg e : copy)
            {
                e.apply(this);
            }
        }
        outAArgs(node);
    }

    public void inAAdditionalArg(AAdditionalArg node)
    {
        defaultIn(node);
    }

    public void outAAdditionalArg(AAdditionalArg node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAdditionalArg(AAdditionalArg node)
    {
        inAAdditionalArg(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAdditionalArg(node);
    }
}
