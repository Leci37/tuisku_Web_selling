//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: AAPL_5Min_1SQU_0816caed Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1SQU_0816caed", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_0816caed(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( upperBB <= 169.885 )
		if( val <= -0.056271 )
			if( dev <= 0.633147 )
				if( basis <= 164.743 )
					ret := -1.000000 // sell
				if( basis > 164.743 )
					if( lowerKC <= 166.199 )
						ret := -0.214286
					if( lowerKC > 166.199 )
						if( dev <= 0.584159 )
							if( upperBB <= 168.7 )
								ret := -1.000000 // sell
							if( upperBB > 168.7 )
								ret := -0.909091 // sell
						if( dev > 0.584159 )
							ret := -0.692308
			if( dev > 0.633147 )
				if( priceRange <= 0.35 )
					if( basis <= 166.496 )
						ret := -0.428571
					if( basis > 166.496 )
						ret := -0.166667
				if( priceRange > 0.35 )
					ret := 0.285714
		if( val > -0.056271 )
			if( sqzOffInt <= 0.5 )
				if( basis <= 163.723 )
					if( rangema <= 0.396162 )
						if( lowerKC <= 163.14 )
							ret := 1.000000 // buy
						if( lowerKC > 163.14 )
							ret := 0.666667
					if( rangema > 0.396162 )
						if( upperKC <= 164.368 )
							ret := 0.076923
						if( upperKC > 164.368 )
							ret := 1.000000 // buy
				if( basis > 163.723 )
					if( rangema <= 0.389587 )
						if( avgHighLow <= 166.301 )
							if( rangema <= 0.249884 )
								if( lowerKC <= 164.647 )
									ret := 0.337423
								if( lowerKC > 164.647 )
									ret := -0.149123
							if( rangema > 0.249884 )
								if( dev <= 0.375902 )
									ret := -0.057613
								if( dev > 0.375902 )
									ret := -0.571429
						if( avgHighLow > 166.301 )
							if( rangema <= 0.221085 )
								if( lowerBB <= 168.939 )
									ret := 0.160954
								if( lowerBB > 168.939 )
									ret := -0.131579
							if( rangema > 0.221085 )
								if( rangema <= 0.346309 )
									ret := 0.364050
								if( rangema > 0.346309 )
									ret := -0.113924
					if( rangema > 0.389587 )
						if( lowerBB <= 166.577 )
							if( basis <= 164.131 )
								ret := -0.250000
							if( basis > 164.131 )
								if( ma <= 167.119 )
									ret := 0.931818 // buy
								if( ma > 167.119 )
									ret := 0.625000
						if( lowerBB > 166.577 )
							if( upperKC <= 168.586 )
								ret := -0.846154 // sell
							if( upperKC > 168.586 )
								if( priceRange <= 0.530287 )
									ret := 0.552846
								if( priceRange > 0.530287 )
									ret := -0.307692
			if( sqzOffInt > 0.5 )
				if( lowerKC <= 169.414 )
					if( dev <= 0.673946 )
						if( lowerKC <= 168.992 )
							if( rangema <= 0.381145 )
								if( upperBB <= 169.403 )
									ret := 0.077885
								if( upperBB > 169.403 )
									ret := 0.420168
							if( rangema > 0.381145 )
								ret := -0.692308
						if( lowerKC > 168.992 )
							if( lowerKC <= 169.102 )
								if( basis <= 169.164 )
									ret := -0.384615
								if( basis > 169.164 )
									ret := -0.782178 // sell
							if( lowerKC > 169.102 )
								if( dev <= 0.354875 )
									ret := 0.050847
								if( dev > 0.354875 )
									ret := 1.000000 // buy
					if( dev > 0.673946 )
						if( upperBB <= 168.354 )
							if( rangema <= 0.776933 )
								if( avgHighLow <= 164.21 )
									ret := 0.909091 // buy
								if( avgHighLow > 164.21 )
									ret := -0.319820
							if( rangema > 0.776933 )
								if( rangema <= 0.783955 )
									ret := 0.888889 // buy
								if( rangema > 0.783955 )
									ret := 0.975610 // buy
						if( upperBB > 168.354 )
							if( rangema <= 0.477332 )
								if( lowerKC <= 167.911 )
									ret := 0.379310
								if( lowerKC > 167.911 )
									ret := -0.460784
							if( rangema > 0.477332 )
								if( ma <= 166.816 )
									ret := -0.411765
								if( ma > 166.816 )
									ret := -0.864407 // sell
				if( lowerKC > 169.414 )
					if( ma <= 169.565 )
						ret := -0.416667
					if( ma > 169.565 )
						if( lowerKC <= 169.488 )
							if( rangema <= 0.0975 )
								ret := 0.600000
							if( rangema > 0.0975 )
								if( upperBB <= 169.868 )
									ret := 0.933333 // buy
								if( upperBB > 169.868 )
									ret := 0.428571
						if( lowerKC > 169.488 )
							if( lowerKC <= 169.591 )
								if( avgHighLow <= 169.612 )
									ret := 0.000000
								if( avgHighLow > 169.612 )
									ret := 0.500000
							if( lowerKC > 169.591 )
								ret := 0.000000
	if( upperBB > 169.885 )
		if( dev <= 3.17433 )
			if( avgHighLow <= 170.015 )
				if( lowerBB <= 168.157 )
					if( rangema <= 0.626535 )
						if( basis <= 169.07 )
							if( lowerBB <= 168.076 )
								if( rangema <= 0.56849 )
									ret := -0.700000 // sell
								if( rangema > 0.56849 )
									ret := -1.000000 // sell
							if( lowerBB > 168.076 )
								ret := -1.000000 // sell
						if( basis > 169.07 )
							ret := -1.000000 // sell
					if( rangema > 0.626535 )
						ret := -0.384615
				if( lowerBB > 168.157 )
					if( avgHighLow <= 169.714 )
						if( upperBB <= 170.457 )
							if( sqzOnInt <= 0.5 )
								if( lowerKC <= 169.21 )
									ret := -0.090909
								if( lowerKC > 169.21 )
									ret := 0.573099
							if( sqzOnInt > 0.5 )
								if( lowerBB <= 169.175 )
									ret := -0.401361
								if( lowerBB > 169.175 )
									ret := 0.009434
						if( upperBB > 170.457 )
							if( rangema <= 0.578775 )
								if( upperBB <= 170.488 )
									ret := -0.857143 // sell
								if( upperBB > 170.488 )
									ret := 0.217391
							if( rangema > 0.578775 )
								ret := -1.000000 // sell
					if( avgHighLow > 169.714 )
						if( avgHighLow <= 169.759 )
							if( rangema <= 0.149295 )
								ret := -0.166667
							if( rangema > 0.149295 )
								if( lowerBB <= 169.578 )
									ret := -0.765217 // sell
								if( lowerBB > 169.578 )
									ret := -0.100000
						if( avgHighLow > 169.759 )
							if( lowerBB <= 169.272 )
								if( upperBB <= 170.831 )
									ret := 0.173077
								if( upperBB > 170.831 )
									ret := -0.264706
							if( lowerBB > 169.272 )
								if( rangema <= 0.207872 )
									ret := -0.192053
								if( rangema > 0.207872 )
									ret := -0.489796
			if( avgHighLow > 170.015 )
				if( upperBB <= 172.661 )
					if( ma <= 170.469 )
						if( dev <= 0.581524 )
							if( basis <= 169.909 )
								if( val <= -0.004809 )
									ret := 0.920000 // buy
								if( val > -0.004809 )
									ret := 0.615385
							if( basis > 169.909 )
								if( val <= -0.031588 )
									ret := -0.583942
								if( val > -0.031588 )
									ret := -0.128461
						if( dev > 0.581524 )
							if( dev <= 0.938923 )
								if( dev <= 0.704798 )
									ret := 0.559322
								if( dev > 0.704798 )
									ret := 0.185567
							if( dev > 0.938923 )
								if( basis <= 170.233 )
									ret := 0.093750
								if( basis > 170.233 )
									ret := -0.695652
					if( ma > 170.469 )
						if( basis <= 170.737 )
							if( sqzOffInt <= 0.5 )
								if( val <= 0.044643 )
									ret := 0.278689
								if( val > 0.044643 )
									ret := -0.705882 // sell
							if( sqzOffInt > 0.5 )
								if( avgHighLow <= 171.277 )
									ret := 0.657692
								if( avgHighLow > 171.277 )
									ret := -0.500000
						if( basis > 170.737 )
							if( priceRange <= 0.168288 )
								if( upperBB <= 171.286 )
									ret := 0.304511
								if( upperBB > 171.286 )
									ret := -0.071119
							if( priceRange > 0.168288 )
								if( ma <= 172.226 )
									ret := 0.165581
								if( ma > 172.226 )
									ret := 0.618750
				if( upperBB > 172.661 )
					if( val <= 0.080895 )
						if( rangema <= 0.64798 )
							if( dev <= 0.281694 )
								if( upperBB <= 174.013 )
									ret := -0.127451
								if( upperBB > 174.013 )
									ret := 0.037541
							if( dev > 0.281694 )
								if( upperKC <= 172.598 )
									ret := -0.383387
								if( upperKC > 172.598 )
									ret := -0.026151
						if( rangema > 0.64798 )
							if( rangema <= 0.773378 )
								if( dev <= 0.829932 )
									ret := 0.006042
								if( dev > 0.829932 )
									ret := -0.429584
							if( rangema > 0.773378 )
								if( basis <= 216.144 )
									ret := -0.218950
								if( basis > 216.144 )
									ret := 0.182362
					if( val > 0.080895 )
						if( upperBB <= 205.407 )
							if( upperKC <= 203.604 )
								if( avgHighLow <= 172.097 )
									ret := 0.890909 // buy
								if( avgHighLow > 172.097 )
									ret := 0.019556
							if( upperKC > 203.604 )
								if( val <= 0.216102 )
									ret := -1.000000 // sell
								if( val > 0.216102 )
									ret := -0.833333 // sell
						if( upperBB > 205.407 )
							if( dev <= 0.699046 )
								if( dev <= 0.461753 )
									ret := 0.126214
								if( dev > 0.461753 )
									ret := -0.219780
							if( dev > 0.699046 )
								if( lowerBB <= 208.016 )
									ret := 0.691860
								if( lowerBB > 208.016 )
									ret := 0.254601
		if( dev > 3.17433 )
			if( dev <= 6.82454 )
				if( lowerKC <= 214.7 )
					if( basis <= 188.956 )
						if( priceRange <= 0.577509 )
							ret := 1.000000 // buy
						if( priceRange > 0.577509 )
							if( ma <= 175.32 )
								ret := 0.562500
							if( ma > 175.32 )
								ret := -0.285714
					if( basis > 188.956 )
						if( priceRange <= 0.31 )
							ret := -0.100000
						if( priceRange > 0.31 )
							if( lowerBB <= 214.118 )
								if( ma <= 202.021 )
									ret := 1.000000 // buy
								if( ma > 202.021 )
									ret := 0.889831 // buy
							if( lowerBB > 214.118 )
								if( ma <= 217.937 )
									ret := 0.416667
								if( ma > 217.937 )
									ret := 1.000000 // buy
				if( lowerKC > 214.7 )
					if( upperBB <= 223.916 )
						if( val <= 0.226613 )
							ret := 0.583333
						if( val > 0.226613 )
							if( lowerKC <= 215.335 )
								ret := -1.000000 // sell
							if( lowerKC > 215.335 )
								ret := -0.571429
					if( upperBB > 223.916 )
						ret := 0.846154 // buy
			if( dev > 6.82454 )
				if( upperBB <= 219.904 )
					if( basis <= 205.397 )
						ret := -0.850000 // sell
					if( basis > 205.397 )
						if( lowerBB <= 197.82 )
							ret := 0.909091 // buy
						if( lowerBB > 197.82 )
							ret := 0.285714
				if( upperBB > 219.904 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_AAPL_5Min_0816caed(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


