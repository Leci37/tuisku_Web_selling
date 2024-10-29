//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ADAUSDT_15Min_1SQU_aa31877a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1SQU_aa31877a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_aa31877a(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( lowerKC <= 0.604704 )
		if( basis <= 0.602716 )
			if( avgHighLow <= 0.59898 )
				if( upperBB <= 0.601556 )
					if( upperKC <= 0.59798 )
						if( rangema <= 0.003381 )
							if( avgHighLow <= 0.388425 )
								ret := 0.017938
							if( avgHighLow > 0.388425 )
								ret := -0.041216
						if( rangema > 0.003381 )
							if( lowerKC <= 0.452038 )
								ret := 0.173534
							if( lowerKC > 0.452038 )
								ret := 0.008112
					if( upperKC > 0.59798 )
						if( rangema <= 0.006215 )
							if( upperBB <= 0.600491 )
								ret := 0.009390
							if( upperBB > 0.600491 )
								ret := -0.492228
						if( rangema > 0.006215 )
							if( val <= 0.000868 )
								ret := -0.775758 // sell
							if( val > 0.000868 )
								ret := -0.133333
				if( upperBB > 0.601556 )
					if( dev <= 0.024079 )
						if( ma <= 0.589863 )
							if( avgHighLow <= 0.5881 )
								ret := 0.923077 // buy
							if( avgHighLow > 0.5881 )
								ret := 0.705882 // buy
						if( ma > 0.589863 )
							if( avgHighLow <= 0.590359 )
								ret := 0.859649 // buy
							if( avgHighLow > 0.590359 )
								ret := 0.204839
					if( dev > 0.024079 )
						if( avgHighLow <= 0.559375 )
							if( priceRange <= 0.006704 )
								ret := -0.375000
							if( priceRange > 0.006704 )
								ret := 0.961538 // buy
						if( avgHighLow > 0.559375 )
							if( lowerKC <= 0.545747 )
								ret := 1.000000 // buy
							if( lowerKC > 0.545747 )
								ret := -0.746835 // sell
			if( avgHighLow > 0.59898 )
				if( lowerBB <= 0.592973 )
					if( rangema <= 0.011773 )
						if( upperBB <= 0.611812 )
							if( val <= 0.000881 )
								ret := -0.875706 // sell
							if( val > 0.000881 )
								ret := -0.375000
						if( upperBB > 0.611812 )
							if( dev <= 0.01552 )
								ret := 0.850000 // buy
							if( dev > 0.01552 )
								ret := -0.784615 // sell
					if( rangema > 0.011773 )
						ret := 1.000000 // buy
				if( lowerBB > 0.592973 )
					if( ma <= 0.599933 )
						if( upperKC <= 0.605938 )
							if( val <= 0.000328 )
								ret := 0.000000
							if( val > 0.000328 )
								ret := 0.666667
						if( upperKC > 0.605938 )
							if( avgHighLow <= 0.60128 )
								ret := 0.923077 // buy
							if( avgHighLow > 0.60128 )
								ret := 0.500000
					if( ma > 0.599933 )
						if( lowerBB <= 0.595117 )
							if( avgHighLow <= 0.604112 )
								ret := -0.700000 // sell
							if( avgHighLow > 0.604112 )
								ret := 0.400000
						if( lowerBB > 0.595117 )
							if( dev <= 0.006452 )
								ret := -0.089286
							if( dev > 0.006452 )
								ret := 0.941176 // buy
		if( basis > 0.602716 )
			if( upperBB <= 0.616284 )
				if( basis <= 0.60494 )
					if( sqzOffInt <= 0.5 )
						if( avgHighLow <= 0.605375 )
							if( lowerBB <= 0.601585 )
								ret := 0.637755
							if( lowerBB > 0.601585 )
								ret := -0.125000
						if( avgHighLow > 0.605375 )
							if( upperBB <= 0.609232 )
								ret := 0.000000
							if( upperBB > 0.609232 )
								ret := -0.666667
					if( sqzOffInt > 0.5 )
						if( val <= -0.000536 )
							if( ma <= 0.603224 )
								ret := 0.600000
							if( ma > 0.603224 )
								ret := 1.000000 // buy
						if( val > -0.000536 )
							if( avgHighLow <= 0.605277 )
								ret := -0.421053
							if( avgHighLow > 0.605277 )
								ret := 0.611111
				if( basis > 0.60494 )
					if( lowerKC <= 0.602167 )
						if( lowerKC <= 0.599418 )
							if( upperKC <= 0.613842 )
								ret := 0.508772
							if( upperKC > 0.613842 )
								ret := -0.431818
						if( lowerKC > 0.599418 )
							if( dev <= 0.005836 )
								ret := -0.388158
							if( dev > 0.005836 )
								ret := -0.671429
					if( lowerKC > 0.602167 )
						if( ma <= 0.607257 )
							if( dev <= 0.002122 )
								ret := -1.000000 // sell
							if( dev > 0.002122 )
								ret := -0.208333
						if( ma > 0.607257 )
							if( avgHighLow <= 0.609195 )
								ret := 0.658683
							if( avgHighLow > 0.609195 )
								ret := -0.656250
			if( upperBB > 0.616284 )
				if( lowerKC <= 0.588392 )
					if( avgHighLow <= 0.617727 )
						if( avgHighLow <= 0.613517 )
							ret := -1.000000 // sell
						if( avgHighLow > 0.613517 )
							ret := -0.428571
					if( avgHighLow > 0.617727 )
						ret := 0.750000 // buy
				if( lowerKC > 0.588392 )
					if( val <= 0.00074 )
						if( ma <= 0.604194 )
							if( avgHighLow <= 0.596 )
								ret := 1.000000 // buy
							if( avgHighLow > 0.596 )
								ret := -0.590909
						if( ma > 0.604194 )
							if( avgHighLow <= 0.618611 )
								ret := 0.642424
							if( avgHighLow > 0.618611 )
								ret := 0.040000
					if( val > 0.00074 )
						if( lowerBB <= 0.589174 )
							if( rangema <= 0.007922 )
								ret := 1.000000 // buy
							if( rangema > 0.007922 )
								ret := 0.761905 // buy
						if( lowerBB > 0.589174 )
							if( avgHighLow <= 0.614917 )
								ret := 0.135135
							if( avgHighLow > 0.614917 )
								ret := -0.866667 // sell
	if( lowerKC > 0.604704 )
		if( sqzOffInt <= 0.5 )
			if( lowerKC <= 0.837123 )
				if( val <= -0.001821 )
					if( upperBB <= 0.672432 )
						ret := -1.000000 // sell
					if( upperBB > 0.672432 )
						if( lowerKC <= 0.690973 )
							if( lowerKC <= 0.659271 )
								ret := 0.250000
							if( lowerKC > 0.659271 )
								ret := 1.000000 // buy
						if( lowerKC > 0.690973 )
							if( lowerKC <= 0.758249 )
								ret := -1.000000 // sell
							if( lowerKC > 0.758249 )
								ret := -0.769231 // sell
				if( val > -0.001821 )
					if( rangema <= 0.00849 )
						if( priceRange <= 0.00368 )
							if( avgHighLow <= 0.646625 )
								ret := -0.012552
							if( avgHighLow > 0.646625 )
								ret := -0.348000
						if( priceRange > 0.00368 )
							if( upperBB <= 0.665823 )
								ret := -0.150538
							if( upperBB > 0.665823 )
								ret := 0.045758
					if( rangema > 0.00849 )
						if( priceRange <= 0.014708 )
							if( lowerBB <= 0.657607 )
								ret := -0.636656
							if( lowerBB > 0.657607 )
								ret := -0.167070
						if( priceRange > 0.014708 )
							if( priceRange <= 0.02885 )
								ret := 0.616667
							if( priceRange > 0.02885 )
								ret := -0.857143 // sell
			if( lowerKC > 0.837123 )
				if( lowerBB <= 0.840204 )
					if( lowerBB <= 0.839792 )
						ret := -1.000000 // sell
					if( lowerBB > 0.839792 )
						ret := -0.142857
				if( lowerBB > 0.840204 )
					if( val <= 0.000791 )
						if( upperBB <= 0.90268 )
							if( priceRange <= 0.009496 )
								ret := -1.000000 // sell
							if( priceRange > 0.009496 )
								ret := -0.750000 // sell
						if( upperBB > 0.90268 )
							ret := -0.750000 // sell
					if( val > 0.000791 )
						ret := -0.333333
		if( sqzOffInt > 0.5 )
			if( upperBB <= 0.645652 )
				if( val <= -0.00063 )
					if( basis <= 0.623023 )
						if( lowerBB <= 0.606779 )
							if( priceRange <= 0.011055 )
								ret := -0.644068
							if( priceRange > 0.011055 )
								ret := 1.000000 // buy
						if( lowerBB > 0.606779 )
							if( upperBB <= 0.635003 )
								ret := 0.666667
							if( upperBB > 0.635003 )
								ret := -0.250000
					if( basis > 0.623023 )
						if( upperBB <= 0.643931 )
							if( priceRange <= 0.008398 )
								ret := -0.842975 // sell
							if( priceRange > 0.008398 )
								ret := -0.272727
						if( upperBB > 0.643931 )
							if( rangema <= 0.00584 )
								ret := -0.700000 // sell
							if( rangema > 0.00584 )
								ret := 1.000000 // buy
				if( val > -0.00063 )
					if( val <= 0.000292 )
						if( lowerKC <= 0.614486 )
							if( avgHighLow <= 0.6178 )
								ret := -0.003831
							if( avgHighLow > 0.6178 )
								ret := 0.684685
						if( lowerKC > 0.614486 )
							if( basis <= 0.628662 )
								ret := -0.372449
							if( basis > 0.628662 )
								ret := 0.140449
					if( val > 0.000292 )
						if( ma <= 0.623265 )
							if( dev <= 0.006631 )
								ret := 0.181818
							if( dev > 0.006631 )
								ret := -0.679739
						if( ma > 0.623265 )
							if( ma <= 0.627748 )
								ret := 0.376344
							if( ma > 0.627748 )
								ret := -0.443299
			if( upperBB > 0.645652 )
				if( avgHighLow <= 0.679027 )
					if( val <= 0.001683 )
						if( val <= 0.000101 )
							if( avgHighLow <= 0.652664 )
								ret := 0.459615
							if( avgHighLow > 0.652664 )
								ret := 0.113636
						if( val > 0.000101 )
							if( ma <= 0.657408 )
								ret := -0.162162
							if( ma > 0.657408 )
								ret := 0.512048
					if( val > 0.001683 )
						if( basis <= 0.67782 )
							if( priceRange <= 0.00745 )
								ret := -0.714286 // sell
							if( priceRange > 0.00745 )
								ret := -1.000000 // sell
						if( basis > 0.67782 )
							ret := 0.250000
				if( avgHighLow > 0.679027 )
					if( lowerKC <= 0.776325 )
						if( priceRange <= 0.009592 )
							if( upperKC <= 0.788081 )
								ret := -0.186047
							if( upperKC > 0.788081 )
								ret := -0.658228
						if( priceRange > 0.009592 )
							if( val <= -0.001182 )
								ret := -0.271605
							if( val > -0.001182 )
								ret := 0.320819
					if( lowerKC > 0.776325 )
						if( lowerKC <= 0.876846 )
							if( dev <= 0.034868 )
								ret := 0.324519
							if( dev > 0.034868 )
								ret := -0.666667
						if( lowerKC > 0.876846 )
							if( upperKC <= 0.901546 )
								ret := -1.000000 // sell
							if( upperKC > 0.901546 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADAUSDT_15Min_aa31877a(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


