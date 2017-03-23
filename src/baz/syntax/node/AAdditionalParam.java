/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.node;

import baz.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AAdditionalParam extends PAdditionalParam
{
    private TComma _comma_;
    private PParam _param_;

    public AAdditionalParam()
    {
        // Constructor
    }

    public AAdditionalParam(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PParam _param_)
    {
        // Constructor
        setComma(_comma_);

        setParam(_param_);

    }

    @Override
    public Object clone()
    {
        return new AAdditionalParam(
            cloneNode(this._comma_),
            cloneNode(this._param_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionalParam(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PParam getParam()
    {
        return this._param_;
    }

    public void setParam(PParam node)
    {
        if(this._param_ != null)
        {
            this._param_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._param_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._param_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._param_ == child)
        {
            this._param_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._param_ == oldChild)
        {
            setParam((PParam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
