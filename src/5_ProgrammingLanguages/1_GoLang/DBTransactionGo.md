# Introduction
- Using [Begin, Commit code](https://dev.to/techschoolguru/a-clean-way-to-implement-database-transaction-in-golang-2ba) block, [atomicity](../../1_HLDDesignComponents/0_SystemGlossaries/Atomicity.md) can be implemented in GoLang.

````go
	if err = ctx.BeginTx(); err != nil {
		return w.Fail(err)
	}
	defer func() {
		if err != nil {
			ctx.Rollback()
			return
		}
		ctx.Commit()
	}()
````

# References
- [A clean way to implement database transaction in Golang](https://dev.to/techschoolguru/a-clean-way-to-implement-database-transaction-in-golang-2ba)