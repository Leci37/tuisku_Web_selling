//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: VETUSDT_30Min_1SQU_39315c58 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1SQU_39315c58", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_39315c58(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avgHighLow <= 0.228821 )
		if( rangema <= 0.003971 )
			if( ma <= 0.158694 )
				if( dev <= 0.00126 )
					if( basis <= 0.047842 )
						if( dev <= 0.000416 )
							if( lowerBB <= 0.02267 )
								if( priceRange <= 0.000161 )
									ret := 0.025822
								if( priceRange > 0.000161 )
									ret := 0.139704
							if( lowerBB > 0.02267 )
								if( rangema <= 0.000241 )
									ret := -0.051972
								if( rangema > 0.000241 )
									ret := 0.055733
						if( dev > 0.000416 )
							if( val <= 6.1e-05 )
								if( lowerBB <= 0.022267 )
									ret := 0.188791
								if( lowerBB > 0.022267 )
									ret := 0.093886
							if( val > 6.1e-05 )
								if( rangema <= 0.001051 )
									ret := -0.091580
								if( rangema > 0.001051 )
									ret := 0.925926 // buy
					if( basis > 0.047842 )
						if( basis <= 0.130278 )
							if( val <= -0.000166 )
								if( upperBB <= 0.09583 )
									ret := 0.652174
								if( upperBB > 0.09583 )
									ret := -0.170213
							if( val > -0.000166 )
								if( ma <= 0.047946 )
									ret := -0.564103
								if( ma > 0.047946 )
									ret := -0.058485
						if( basis > 0.130278 )
							if( val <= 2.6e-05 )
								if( dev <= 0.00124 )
									ret := -0.319149
								if( dev > 0.00124 )
									ret := 0.571429
							if( val > 2.6e-05 )
								if( upperBB <= 0.140363 )
									ret := -0.851852 // sell
								if( upperBB > 0.140363 )
									ret := -0.312500
				if( dev > 0.00126 )
					if( lowerKC <= 0.149597 )
						if( dev <= 0.002767 )
							if( ma <= 0.023621 )
								if( basis <= 0.021688 )
									ret := 0.236364
								if( basis > 0.021688 )
									ret := 0.690909
							if( ma > 0.023621 )
								if( basis <= 0.059784 )
									ret := 0.034947
								if( basis > 0.059784 )
									ret := 0.138239
						if( dev > 0.002767 )
							if( lowerBB <= 0.106771 )
								if( upperBB <= 0.046731 )
									ret := -0.305389
								if( upperBB > 0.046731 )
									ret := 0.104444
							if( lowerBB > 0.106771 )
								if( upperKC <= 0.120915 )
									ret := -0.266904
								if( upperKC > 0.120915 )
									ret := 0.011408
					if( lowerKC > 0.149597 )
						if( val <= 0.000141 )
							if( avgHighLow <= 0.157667 )
								if( rangema <= 0.001236 )
									ret := 0.000000
								if( rangema > 0.001236 )
									ret := 0.852713 // buy
							if( avgHighLow > 0.157667 )
								if( dev <= 0.001554 )
									ret := -0.800000 // sell
								if( dev > 0.001554 )
									ret := 0.297872
						if( val > 0.000141 )
							if( upperBB <= 0.161135 )
								if( lowerKC <= 0.150933 )
									ret := -0.888889 // sell
								if( lowerKC > 0.150933 )
									ret := 0.523810
							if( upperBB > 0.161135 )
								if( val <= 0.000406 )
									ret := -0.882353 // sell
								if( val > 0.000406 )
									ret := -0.200000
			if( ma > 0.158694 )
				if( dev <= 0.002842 )
					if( priceRange <= 0.0012 )
						if( avgHighLow <= 0.164472 )
							if( dev <= 0.002015 )
								if( upperKC <= 0.162712 )
									ret := -0.071429
								if( upperKC > 0.162712 )
									ret := -0.500000
							if( dev > 0.002015 )
								ret := 0.500000
						if( avgHighLow > 0.164472 )
							ret := 0.600000
					if( priceRange > 0.0012 )
						if( rangema <= 0.002493 )
							if( priceRange <= 0.002084 )
								if( upperBB <= 0.160887 )
									ret := -0.958333 // sell
								if( upperBB > 0.160887 )
									ret := -0.294872
							if( priceRange > 0.002084 )
								if( rangema <= 0.002108 )
									ret := 0.666667
								if( rangema > 0.002108 )
									ret := -0.142857
						if( rangema > 0.002493 )
							if( upperKC <= 0.190509 )
								if( priceRange <= 0.00414 )
									ret := -0.949153 // sell
								if( priceRange > 0.00414 )
									ret := -0.666667
							if( upperKC > 0.190509 )
								if( ma <= 0.188439 )
									ret := 0.750000 // buy
								if( ma > 0.188439 )
									ret := -0.524390
				if( dev > 0.002842 )
					if( lowerKC <= 0.183231 )
						if( upperBB <= 0.18164 )
							if( val <= -0.0001 )
								if( rangema <= 0.002247 )
									ret := 0.200000
								if( rangema > 0.002247 )
									ret := -0.570000
							if( val > -0.0001 )
								if( dev <= 0.005224 )
									ret := 0.360870
								if( dev > 0.005224 )
									ret := -0.700000 // sell
						if( upperBB > 0.18164 )
							if( sqzOnInt <= 0.5 )
								if( dev <= 0.00659 )
									ret := -0.103448
								if( dev > 0.00659 )
									ret := -0.833333 // sell
							if( sqzOnInt > 0.5 )
								if( lowerBB <= 0.181918 )
									ret := -0.757895 // sell
								if( lowerBB > 0.181918 )
									ret := -0.321429
					if( lowerKC > 0.183231 )
						if( lowerKC <= 0.192422 )
							if( avgHighLow <= 0.191895 )
								if( priceRange <= 0.004115 )
									ret := 0.891892 // buy
								if( priceRange > 0.004115 )
									ret := 0.200000
							if( avgHighLow > 0.191895 )
								if( lowerBB <= 0.187534 )
									ret := -0.111111
								if( lowerBB > 0.187534 )
									ret := 0.666667
						if( lowerKC > 0.192422 )
							if( sqzOffInt <= 0.5 )
								if( upperKC <= 0.223317 )
									ret := -0.121795
								if( upperKC > 0.223317 )
									ret := 0.698113
							if( sqzOffInt > 0.5 )
								if( priceRange <= 0.005578 )
									ret := -0.578313
								if( priceRange > 0.005578 )
									ret := 0.214286
		if( rangema > 0.003971 )
			if( avgHighLow <= 0.087163 )
				if( priceRange <= 0.006497 )
					if( upperBB <= 0.096107 )
						if( upperBB <= 0.095055 )
							if( lowerBB <= 0.071424 )
								ret := 0.857143 // buy
							if( lowerBB > 0.071424 )
								ret := 1.000000 // buy
						if( upperBB > 0.095055 )
							if( avgHighLow <= 0.084394 )
								ret := 0.250000
							if( avgHighLow > 0.084394 )
								ret := 1.000000 // buy
					if( upperBB > 0.096107 )
						ret := 0.000000
				if( priceRange > 0.006497 )
					ret := 0.000000
			if( avgHighLow > 0.087163 )
				if( basis <= 0.15081 )
					if( lowerBB <= 0.126012 )
						if( lowerBB <= 0.080385 )
							ret := -1.000000 // sell
						if( lowerBB > 0.080385 )
							if( val <= -0.000368 )
								if( upperBB <= 0.107968 )
									ret := -0.833333 // sell
								if( upperBB > 0.107968 )
									ret := 0.850000 // buy
							if( val > -0.000368 )
								if( lowerBB <= 0.103766 )
									ret := 0.230415
								if( lowerBB > 0.103766 )
									ret := -0.196970
					if( lowerBB > 0.126012 )
						if( priceRange <= 0.005615 )
							if( val <= -0.00056 )
								if( upperBB <= 0.145627 )
									ret := 0.125000
								if( upperBB > 0.145627 )
									ret := -1.000000 // sell
							if( val > -0.00056 )
								if( lowerKC <= 0.141159 )
									ret := -0.975000 // sell
								if( lowerKC > 0.141159 )
									ret := -0.500000
						if( priceRange > 0.005615 )
							if( val <= -0.000306 )
								ret := 0.714286 // buy
							if( val > -0.000306 )
								ret := -1.000000 // sell
				if( basis > 0.15081 )
					if( lowerBB <= 0.169567 )
						if( lowerBB <= 0.160273 )
							if( lowerBB <= 0.154946 )
								if( val <= -0.000132 )
									ret := 0.333333
								if( val > -0.000132 )
									ret := 0.842857 // buy
							if( lowerBB > 0.154946 )
								if( rangema <= 0.005389 )
									ret := -0.528302
								if( rangema > 0.005389 )
									ret := 0.317073
						if( lowerBB > 0.160273 )
							if( priceRange <= 0.004037 )
								if( lowerBB <= 0.16367 )
									ret := 0.878788 // buy
								if( lowerBB > 0.16367 )
									ret := -0.640000
							if( priceRange > 0.004037 )
								if( upperBB <= 0.182898 )
									ret := 0.555556
								if( upperBB > 0.182898 )
									ret := 0.832215 // buy
					if( lowerBB > 0.169567 )
						if( upperKC <= 0.238757 )
							if( rangema <= 0.005879 )
								if( val <= -0.000132 )
									ret := 0.580808
								if( val > -0.000132 )
									ret := 0.067039
							if( rangema > 0.005879 )
								if( rangema <= 0.006934 )
									ret := -0.480620
								if( rangema > 0.006934 )
									ret := 0.131222
						if( upperKC > 0.238757 )
							if( upperKC <= 0.246069 )
								if( lowerKC <= 0.217575 )
									ret := 0.919355 // buy
								if( lowerKC > 0.217575 )
									ret := -0.200000
							if( upperKC > 0.246069 )
								if( ma <= 0.231896 )
									ret := -1.000000 // sell
								if( ma > 0.231896 )
									ret := 0.750000 // buy
	if( avgHighLow > 0.228821 )
		if( upperKC <= 0.244198 )
			if( dev <= 0.010724 )
				if( basis <= 0.229218 )
					ret := 0.000000
				if( basis > 0.229218 )
					if( upperKC <= 0.237343 )
						if( lowerKC <= 0.224413 )
							ret := -0.250000
						if( lowerKC > 0.224413 )
							if( priceRange <= 0.003923 )
								ret := -1.000000 // sell
							if( priceRange > 0.003923 )
								ret := -0.750000 // sell
					if( upperKC > 0.237343 )
						if( lowerKC <= 0.226501 )
							if( priceRange <= 0.004675 )
								if( rangema <= 0.005843 )
									ret := -0.285714
								if( rangema > 0.005843 )
									ret := -0.750000 // sell
							if( priceRange > 0.004675 )
								ret := -1.000000 // sell
						if( lowerKC > 0.226501 )
							ret := 0.000000
			if( dev > 0.010724 )
				ret := -1.000000 // sell
		if( upperKC > 0.244198 )
			if( ma <= 0.235572 )
				if( sqzOffInt <= 0.5 )
					if( upperBB <= 0.246021 )
						if( upperBB <= 0.242113 )
							ret := 0.200000
						if( upperBB > 0.242113 )
							if( dev <= 0.012347 )
								ret := 1.000000 // buy
							if( dev > 0.012347 )
								ret := 0.750000 // buy
					if( upperBB > 0.246021 )
						if( basis <= 0.234326 )
							ret := -1.000000 // sell
						if( basis > 0.234326 )
							if( val <= -0.001178 )
								ret := 0.833333 // buy
							if( val > -0.001178 )
								ret := -0.500000
				if( sqzOffInt > 0.5 )
					if( priceRange <= 0.015987 )
						ret := 1.000000 // buy
					if( priceRange > 0.015987 )
						ret := 0.571429
			if( ma > 0.235572 )
				if( lowerKC <= 0.237721 )
					if( lowerBB <= 0.23403 )
						if( avgHighLow <= 0.235249 )
							if( priceRange <= 0.007806 )
								ret := -0.750000 // sell
							if( priceRange > 0.007806 )
								ret := 0.857143 // buy
						if( avgHighLow > 0.235249 )
							if( lowerBB <= 0.228921 )
								if( val <= 0.000437 )
									ret := -1.000000 // sell
								if( val > 0.000437 )
									ret := -0.833333 // sell
							if( lowerBB > 0.228921 )
								if( rangema <= 0.00604 )
									ret := -0.829268 // sell
								if( rangema > 0.00604 )
									ret := -0.100000
					if( lowerBB > 0.23403 )
						if( val <= -0.000404 )
							if( lowerBB <= 0.235012 )
								ret := 0.250000
							if( lowerBB > 0.235012 )
								if( avgHighLow <= 0.248952 )
									ret := 1.000000 // buy
								if( avgHighLow > 0.248952 )
									ret := 0.750000 // buy
						if( val > -0.000404 )
							if( lowerBB <= 0.235034 )
								ret := 0.333333
							if( lowerBB > 0.235034 )
								if( upperKC <= 0.254657 )
									ret := -1.000000 // sell
								if( upperKC > 0.254657 )
									ret := -0.428571
				if( lowerKC > 0.237721 )
					if( lowerKC <= 0.24228 )
						if( avgHighLow <= 0.252235 )
							ret := -1.000000 // sell
						if( avgHighLow > 0.252235 )
							if( priceRange <= 0.006327 )
								ret := -0.750000 // sell
							if( priceRange > 0.006327 )
								ret := -1.000000 // sell
					if( lowerKC > 0.24228 )
						ret := -0.400000
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_39315c58(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


