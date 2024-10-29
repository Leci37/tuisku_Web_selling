//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MDB_5Min_1SQU_31bfd017 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_1SQU_31bfd017", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_31bfd017(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( lowerBB <= 344.843 )
		if( lowerKC <= 219.818 )
			if( upperKC <= 221.265 )
				if( lowerKC <= 218.436 )
					if( ma <= 218.806 )
						if( val <= 0.139745 )
							ret := 0.421053
						if( val > 0.139745 )
							ret := -0.321839
					if( ma > 218.806 )
						if( val <= -0.012181 )
							ret := 0.915493 // buy
						if( val > -0.012181 )
							ret := 0.358974
				if( lowerKC > 218.436 )
					if( rangema <= 0.527072 )
						if( upperKC <= 219.857 )
							ret := -0.111111
						if( upperKC > 219.857 )
							ret := -0.819444 // sell
					if( rangema > 0.527072 )
						if( priceRange <= 1.2801 )
							ret := 0.000000
						if( priceRange > 1.2801 )
							ret := 1.000000 // buy
			if( upperKC > 221.265 )
				if( upperKC <= 223.446 )
					if( dev <= 0.642478 )
						ret := 0.250000
					if( dev > 0.642478 )
						if( priceRange <= 0.985733 )
							ret := 0.944444 // buy
						if( priceRange > 0.985733 )
							ret := 0.672897
				if( upperKC > 223.446 )
					if( val <= -0.135478 )
						ret := 1.000000 // buy
					if( val > -0.135478 )
						if( val <= -0.074712 )
							ret := 0.000000
						if( val > -0.074712 )
							ret := -0.894737 // sell
		if( lowerKC > 219.818 )
			if( avgHighLow <= 345.423 )
				if( dev <= 4.12506 )
					if( priceRange <= 4.42111 )
						if( rangema <= 2.29935 )
							ret := 0.047262
						if( rangema > 2.29935 )
							ret := 0.626437
					if( priceRange > 4.42111 )
						if( basis <= 283.256 )
							ret := -0.188889
						if( basis > 283.256 )
							ret := -0.712329 // sell
				if( dev > 4.12506 )
					if( dev <= 6.08937 )
						if( priceRange <= 0.351696 )
							ret := 0.561404
						if( priceRange > 0.351696 )
							ret := -0.258459
					if( dev > 6.08937 )
						if( rangema <= 6.61813 )
							ret := 0.160317
						if( rangema > 6.61813 )
							ret := -1.000000 // sell
			if( avgHighLow > 345.423 )
				if( ma <= 345.817 )
					if( val <= -0.004247 )
						if( upperKC <= 347.33 )
							ret := 0.722222 // buy
						if( upperKC > 347.33 )
							ret := 0.000000
					if( val > -0.004247 )
						if( lowerBB <= 337.374 )
							ret := 0.000000
						if( lowerBB > 337.374 )
							ret := 0.939655 // buy
				if( ma > 345.817 )
					if( dev <= 7.80971 )
						if( dev <= 7.26437 )
							ret := 0.151429
						if( dev > 7.26437 )
							ret := -0.852941 // sell
					if( dev > 7.80971 )
						if( upperKC <= 355.012 )
							ret := 0.907407 // buy
						if( upperKC > 355.012 )
							ret := -0.200000
	if( lowerBB > 344.843 )
		if( ma <= 348.893 )
			if( dev <= 1.16304 )
				if( priceRange <= 0.975 )
					if( rangema <= 0.804927 )
						if( ma <= 347.723 )
							ret := 0.000000
						if( ma > 347.723 )
							ret := -0.285714
					if( rangema > 0.804927 )
						if( val <= 0.055448 )
							ret := 0.625000
						if( val > 0.055448 )
							ret := 0.076923
				if( priceRange > 0.975 )
					if( rangema <= 0.799525 )
						ret := -1.000000 // sell
					if( rangema > 0.799525 )
						ret := -0.333333
			if( dev > 1.16304 )
				if( val <= 0.026852 )
					if( ma <= 347.049 )
						if( val <= -0.173749 )
							ret := 0.000000
						if( val > -0.173749 )
							ret := -0.943396 // sell
					if( ma > 347.049 )
						if( dev <= 1.50909 )
							ret := 0.317073
						if( dev > 1.50909 )
							ret := -0.456522
				if( val > 0.026852 )
					if( val <= 0.157153 )
						if( lowerKC <= 345.112 )
							ret := 0.166667
						if( lowerKC > 345.112 )
							ret := -0.895238 // sell
					if( val > 0.157153 )
						if( lowerKC <= 345.147 )
							ret := -0.700000 // sell
						if( lowerKC > 345.147 )
							ret := 0.066667
		if( ma > 348.893 )
			if( rangema <= 5.15495 )
				if( val <= -0.393989 )
					if( dev <= 4.51894 )
						if( rangema <= 1.11713 )
							ret := -0.731707 // sell
						if( rangema > 1.11713 )
							ret := -0.074157
					if( dev > 4.51894 )
						if( dev <= 7.70254 )
							ret := 0.521415
						if( dev > 7.70254 )
							ret := 0.047146
				if( val > -0.393989 )
					if( upperBB <= 353.623 )
						if( basis <= 350.588 )
							ret := -0.070968
						if( basis > 350.588 )
							ret := 0.450479
					if( upperBB > 353.623 )
						if( upperBB <= 354.724 )
							ret := -0.454545
						if( upperBB > 354.724 )
							ret := -0.032326
			if( rangema > 5.15495 )
				if( val <= -1.87821 )
					ret := 1.000000 // buy
				if( val > -1.87821 )
					if( lowerBB <= 368.263 )
						if( ma <= 373.793 )
							ret := -0.882353 // sell
						if( ma > 373.793 )
							ret := 0.200000
					if( lowerBB > 368.263 )
						if( rangema <= 7.38583 )
							ret := -0.921053 // sell
						if( rangema > 7.38583 )
							ret := -0.250000
	
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
float op_operation = decision_tree_0_MDB_5Min_31bfd017(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


