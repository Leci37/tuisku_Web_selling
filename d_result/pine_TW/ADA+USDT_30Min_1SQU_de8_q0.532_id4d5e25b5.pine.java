//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ADAUSDT_30Min_1SQU_4d5e25b5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1SQU_4d5e25b5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_4d5e25b5(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis <= 0.090816 )
		if( val <= -6.4e-05 )
			if( ma <= 0.084797 )
				if( upperBB <= 0.082907 )
					if( lowerKC <= 0.078185 )
						if( upperKC <= 0.080335 )
							ret := 0.000000
						if( upperKC > 0.080335 )
							ret := 1.000000 // buy
					if( lowerKC > 0.078185 )
						if( upperBB <= 0.082338 )
							ret := -1.000000 // sell
						if( upperBB > 0.082338 )
							ret := 0.000000
				if( upperBB > 0.082907 )
					if( basis <= 0.082441 )
						ret := 1.000000 // buy
					if( basis > 0.082441 )
						ret := 0.571429
			if( ma > 0.084797 )
				if( avgHighLow <= 0.089135 )
					if( upperKC <= 0.088852 )
						if( avgHighLow <= 0.084626 )
							ret := -1.000000 // sell
						if( avgHighLow > 0.084626 )
							ret := -0.500000
					if( upperKC > 0.088852 )
						ret := -1.000000 // sell
				if( avgHighLow > 0.089135 )
					ret := 0.000000
		if( val > -6.4e-05 )
			if( upperBB <= 0.083004 )
				if( rangema <= 0.000542 )
					if( upperBB <= 0.082626 )
						ret := -1.000000 // sell
					if( upperBB > 0.082626 )
						if( avgHighLow <= 0.081944 )
							ret := -0.400000
						if( avgHighLow > 0.081944 )
							ret := -1.000000 // sell
				if( rangema > 0.000542 )
					if( lowerBB <= 0.079948 )
						if( priceRange <= 0.001423 )
							if( rangema <= 0.001033 )
								if( lowerBB <= 0.076685 )
									ret := 0.125000
								if( lowerBB > 0.076685 )
									ret := 0.764706 // buy
							if( rangema > 0.001033 )
								ret := 0.000000
						if( priceRange > 0.001423 )
							ret := -0.800000 // sell
					if( lowerBB > 0.079948 )
						if( dev <= 0.000955 )
							if( priceRange <= 0.000789 )
								if( rangema <= 0.000615 )
									ret := -0.714286 // sell
								if( rangema > 0.000615 )
									ret := -0.100000
							if( priceRange > 0.000789 )
								ret := -1.000000 // sell
						if( dev > 0.000955 )
							if( avgHighLow <= 0.080934 )
								ret := -0.400000
							if( avgHighLow > 0.080934 )
								if( val <= -2e-05 )
									ret := 0.888889 // buy
								if( val > -2e-05 )
									ret := 0.181818
			if( upperBB > 0.083004 )
				if( rangema <= 0.000608 )
					ret := -1.000000 // sell
				if( rangema > 0.000608 )
					if( upperKC <= 0.093606 )
						if( lowerBB <= 0.08822 )
							if( rangema <= 0.00095 )
								if( dev <= 0.001619 )
									ret := 0.928571 // buy
								if( dev > 0.001619 )
									ret := -0.333333
							if( rangema > 0.00095 )
								if( basis <= 0.088651 )
									ret := 0.987342 // buy
								if( basis > 0.088651 )
									ret := 0.771930 // buy
						if( lowerBB > 0.08822 )
							if( lowerKC <= 0.088739 )
								if( priceRange <= 0.00085 )
									ret := 0.000000
								if( priceRange > 0.00085 )
									ret := 0.300000
							if( lowerKC > 0.088739 )
								if( priceRange <= 0.001155 )
									ret := 0.714286 // buy
								if( priceRange > 0.001155 )
									ret := 0.000000
					if( upperKC > 0.093606 )
						ret := -1.000000 // sell
	if( basis > 0.090816 )
		if( val <= -0.000447 )
			if( avgHighLow <= 0.490884 )
				if( rangema <= 0.003886 )
					if( upperKC <= 0.371508 )
						if( upperBB <= 0.357107 )
							if( lowerBB <= 0.281425 )
								if( lowerBB <= 0.277586 )
									ret := 0.142857
								if( lowerBB > 0.277586 )
									ret := 0.800000 // buy
							if( lowerBB > 0.281425 )
								if( lowerBB <= 0.303307 )
									ret := -0.362069
								if( lowerBB > 0.303307 )
									ret := 0.100592
						if( upperBB > 0.357107 )
							if( avgHighLow <= 0.349516 )
								if( avgHighLow <= 0.348298 )
									ret := 1.000000 // buy
								if( avgHighLow > 0.348298 )
									ret := 0.857143 // buy
							if( avgHighLow > 0.349516 )
								if( priceRange <= 0.005801 )
									ret := 0.341880
								if( priceRange > 0.005801 )
									ret := 0.750000 // buy
					if( upperKC > 0.371508 )
						if( lowerBB <= 0.370628 )
							if( upperBB <= 0.389473 )
								if( priceRange <= 0.003619 )
									ret := -0.016667
								if( priceRange > 0.003619 )
									ret := -0.700000 // sell
							if( upperBB > 0.389473 )
								ret := -1.000000 // sell
						if( lowerBB > 0.370628 )
							if( sqzOffInt <= 0.5 )
								if( lowerBB <= 0.379537 )
									ret := 0.617647
								if( lowerBB > 0.379537 )
									ret := -0.182663
							if( sqzOffInt > 0.5 )
								if( upperBB <= 0.425889 )
									ret := 0.007692
								if( upperBB > 0.425889 )
									ret := 0.283154
				if( rangema > 0.003886 )
					if( priceRange <= 0.01152 )
						if( upperBB <= 0.35859 )
							if( dev <= 0.008593 )
								if( val <= -0.001004 )
									ret := 0.080000
								if( val > -0.001004 )
									ret := 0.718254 // buy
							if( dev > 0.008593 )
								if( avgHighLow <= 0.322334 )
									ret := 0.020202
								if( avgHighLow > 0.322334 )
									ret := 0.588235
						if( upperBB > 0.35859 )
							if( upperKC <= 0.498704 )
								if( lowerKC <= 0.343642 )
									ret := -0.479167
								if( lowerKC > 0.343642 )
									ret := 0.192058
							if( upperKC > 0.498704 )
								if( ma <= 0.490115 )
									ret := 0.965517 // buy
								if( ma > 0.490115 )
									ret := 0.727273 // buy
					if( priceRange > 0.01152 )
						if( sqzOffInt <= 0.5 )
							if( avgHighLow <= 0.326993 )
								if( upperBB <= 0.305952 )
									ret := -0.400000
								if( upperBB > 0.305952 )
									ret := 0.956522 // buy
							if( avgHighLow > 0.326993 )
								if( dev <= 0.008964 )
									ret := 0.500000
								if( dev > 0.008964 )
									ret := -0.232558
						if( sqzOffInt > 0.5 )
							if( rangema <= 0.004701 )
								ret := -0.750000 // sell
							if( rangema > 0.004701 )
								if( avgHighLow <= 0.4861 )
									ret := 0.773196 // buy
								if( avgHighLow > 0.4861 )
									ret := -0.333333
			if( avgHighLow > 0.490884 )
				if( avgHighLow <= 0.5115 )
					if( upperKC <= 0.505274 )
						if( rangema <= 0.007833 )
							if( lowerKC <= 0.483713 )
								if( ma <= 0.490757 )
									ret := 0.000000
								if( ma > 0.490757 )
									ret := -0.666667
							if( lowerKC > 0.483713 )
								if( sqzOffInt <= 0.5 )
									ret := 0.533333
								if( sqzOffInt > 0.5 )
									ret := 0.019231
						if( rangema > 0.007833 )
							if( rangema <= 0.008227 )
								if( lowerBB <= 0.481905 )
									ret := 0.750000 // buy
								if( lowerBB > 0.481905 )
									ret := 1.000000 // buy
							if( rangema > 0.008227 )
								ret := 0.500000
					if( upperKC > 0.505274 )
						if( upperBB <= 0.507355 )
							if( basis <= 0.499415 )
								if( priceRange <= 0.007023 )
									ret := -0.421053
								if( priceRange > 0.007023 )
									ret := 0.750000 // buy
							if( basis > 0.499415 )
								if( priceRange <= 0.003839 )
									ret := 0.000000
								if( priceRange > 0.003839 )
									ret := 0.777778 // buy
						if( upperBB > 0.507355 )
							if( avgHighLow <= 0.50188 )
								if( lowerBB <= 0.478944 )
									ret := -0.150000
								if( lowerBB > 0.478944 )
									ret := -0.857143 // sell
							if( avgHighLow > 0.50188 )
								if( upperKC <= 0.514075 )
									ret := 0.180000
								if( upperKC > 0.514075 )
									ret := -0.521739
				if( avgHighLow > 0.5115 )
					if( rangema <= 0.07848 )
						if( upperBB <= 1.42776 )
							if( rangema <= 0.011128 )
								if( basis <= 1.21904 )
									ret := 0.049711
								if( basis > 1.21904 )
									ret := -0.253102
							if( rangema > 0.011128 )
								if( rangema <= 0.032545 )
									ret := 0.135388
								if( rangema > 0.032545 )
									ret := 0.441472
						if( upperBB > 1.42776 )
							if( upperKC <= 1.53401 )
								if( upperKC <= 1.5224 )
									ret := -0.215420
								if( upperKC > 1.5224 )
									ret := -0.769231 // sell
							if( upperKC > 1.53401 )
								if( lowerKC <= 1.48049 )
									ret := 0.435185
								if( lowerKC > 1.48049 )
									ret := 0.015224
					if( rangema > 0.07848 )
						if( avgHighLow <= 2.40138 )
							if( rangema <= 0.079924 )
								ret := 0.750000 // buy
							if( rangema > 0.079924 )
								if( lowerBB <= 1.45019 )
									ret := 1.000000 // buy
								if( lowerBB > 1.45019 )
									ret := 0.875000 // buy
						if( avgHighLow > 2.40138 )
							ret := 0.000000
		if( val > -0.000447 )
			if( rangema <= 0.150863 )
				if( lowerBB <= 0.152127 )
					if( ma <= 0.116519 )
						if( upperKC <= 0.109102 )
							if( ma <= 0.091666 )
								if( upperKC <= 0.092707 )
									ret := 0.041237
								if( upperKC > 0.092707 )
									ret := -0.690141
							if( ma > 0.091666 )
								if( lowerKC <= 0.090857 )
									ret := 0.470874
								if( lowerKC > 0.090857 )
									ret := 0.062698
						if( upperKC > 0.109102 )
							if( lowerBB <= 0.105618 )
								if( lowerBB <= 0.103323 )
									ret := 0.200000
								if( lowerBB > 0.103323 )
									ret := -0.761905 // sell
							if( lowerBB > 0.105618 )
								if( dev <= 0.001335 )
									ret := -0.382775
								if( dev > 0.001335 )
									ret := 0.042705
					if( ma > 0.116519 )
						if( avgHighLow <= 0.131551 )
							if( dev <= 0.006906 )
								if( dev <= 0.004188 )
									ret := 0.782609 // buy
								if( dev > 0.004188 )
									ret := 0.963415 // buy
							if( dev > 0.006906 )
								ret := 0.571429
						if( avgHighLow > 0.131551 )
							if( basis <= 0.151128 )
								if( basis <= 0.145662 )
									ret := 0.204797
								if( basis > 0.145662 )
									ret := -0.298780
							if( basis > 0.151128 )
								if( avgHighLow <= 0.154502 )
									ret := 0.567376
								if( avgHighLow > 0.154502 )
									ret := 0.058394
				if( lowerBB > 0.152127 )
					if( upperKC <= 0.160064 )
						if( val <= 6.8e-05 )
							if( rangema <= 0.002226 )
								if( upperBB <= 0.155325 )
									ret := -1.000000 // sell
								if( upperBB > 0.155325 )
									ret := -0.166667
							if( rangema > 0.002226 )
								ret := 1.000000 // buy
						if( val > 6.8e-05 )
							if( upperBB <= 0.159672 )
								if( rangema <= 0.001062 )
									ret := -0.869565 // sell
								if( rangema > 0.001062 )
									ret := -0.176471
							if( upperBB > 0.159672 )
								if( priceRange <= 0.001812 )
									ret := -0.965517 // sell
								if( priceRange > 0.001812 )
									ret := -0.571429
					if( upperKC > 0.160064 )
						if( avgHighLow <= 0.158247 )
							if( rangema <= 0.004986 )
								if( avgHighLow <= 0.157563 )
									ret := 0.746479 // buy
								if( avgHighLow > 0.157563 )
									ret := 0.327273
							if( rangema > 0.004986 )
								ret := -1.000000 // sell
						if( avgHighLow > 0.158247 )
							if( lowerBB <= 0.159151 )
								if( upperBB <= 0.165442 )
									ret := -0.056250
								if( upperBB > 0.165442 )
									ret := -0.678161
							if( lowerBB > 0.159151 )
								if( priceRange <= 0.025287 )
									ret := 0.028076
								if( priceRange > 0.025287 )
									ret := 0.098643
			if( rangema > 0.150863 )
				if( lowerKC <= 1.32819 )
					ret := -0.500000
				if( lowerKC > 1.32819 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_4d5e25b5(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


