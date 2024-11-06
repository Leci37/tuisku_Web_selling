//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: FFIV_15Min_1SQU_d5c2a93f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1SQU_d5c2a93f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_d5c2a93f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avgHighLow <= 199.838 )
		if( upperKC <= 199.05 )
			if( lowerBB <= 86.9417 )
				if( avgHighLow <= 86.5505 )
					ret := 0.500000
				if( avgHighLow > 86.5505 )
					ret := 1.000000 // buy
			if( lowerBB > 86.9417 )
				if( lowerKC <= 142.46 )
					if( lowerBB <= 140.379 )
						if( lowerBB <= 139.774 )
							if( priceRange <= 0.102415 )
								if( dev <= 1.40145 )
									ret := 0.255487
								if( dev > 1.40145 )
									ret := -0.142857
							if( priceRange > 0.102415 )
								if( rangema <= 0.651175 )
									ret := 0.041597
								if( rangema > 0.651175 )
									ret := 0.124848
						if( lowerBB > 139.774 )
							if( rangema <= 0.365495 )
								if( upperKC <= 141.294 )
									ret := -0.725275 // sell
								if( upperKC > 141.294 )
									ret := -0.176471
							if( rangema > 0.365495 )
								if( priceRange <= 0.844055 )
									ret := -0.026786
								if( priceRange > 0.844055 )
									ret := -0.528846
					if( lowerBB > 140.379 )
						if( upperKC <= 141.689 )
							if( avgHighLow <= 141.044 )
								if( lowerKC <= 140.43 )
									ret := 0.050000
								if( lowerKC > 140.43 )
									ret := 0.555556
							if( avgHighLow > 141.044 )
								if( lowerKC <= 140.797 )
									ret := 0.928571 // buy
								if( lowerKC > 140.797 )
									ret := 0.250000
						if( upperKC > 141.689 )
							if( upperBB <= 142.073 )
								if( lowerKC <= 140.775 )
									ret := 0.037915
								if( lowerKC > 140.775 )
									ret := -0.567568
							if( upperBB > 142.073 )
								if( priceRange <= 0.129775 )
									ret := 0.556250
								if( priceRange > 0.129775 )
									ret := 0.193766
				if( lowerKC > 142.46 )
					if( avgHighLow <= 143.329 )
						if( dev <= 2.22504 )
							if( upperBB <= 143.758 )
								if( avgHighLow <= 142.933 )
									ret := -0.476190
								if( avgHighLow > 142.933 )
									ret := 0.041237
							if( upperBB > 143.758 )
								if( val <= 0.05053 )
									ret := -0.573460
								if( val > 0.05053 )
									ret := 0.081081
						if( dev > 2.22504 )
							if( val <= -0.272348 )
								ret := -0.142857
							if( val > -0.272348 )
								if( lowerBB <= 140.582 )
									ret := -0.200000
								if( lowerBB > 140.582 )
									ret := 0.947368 // buy
					if( avgHighLow > 143.329 )
						if( upperKC <= 144.609 )
							if( ma <= 143.963 )
								if( avgHighLow <= 143.416 )
									ret := -0.066667
								if( avgHighLow > 143.416 )
									ret := 0.344643
							if( ma > 143.963 )
								if( upperBB <= 144.693 )
									ret := -0.605263
								if( upperBB > 144.693 )
									ret := 0.222222
						if( upperKC > 144.609 )
							if( basis <= 144.185 )
								if( avgHighLow <= 143.804 )
									ret := -0.561151
								if( avgHighLow > 143.804 )
									ret := -0.116105
							if( basis > 144.185 )
								if( dev <= 11.5151 )
									ret := 0.035547
								if( dev > 11.5151 )
									ret := -0.480519
		if( upperKC > 199.05 )
			if( lowerKC <= 195.915 )
				if( priceRange <= 3.76086 )
					if( rangema <= 3.70611 )
						if( val <= 0.535442 )
							if( rangema <= 1.61455 )
								if( ma <= 196.989 )
									ret := -0.500000
								if( ma > 196.989 )
									ret := 0.789474 // buy
							if( rangema > 1.61455 )
								if( val <= 0.097752 )
									ret := 0.775862 // buy
								if( val > 0.097752 )
									ret := 0.962617 // buy
						if( val > 0.535442 )
							ret := 0.000000
					if( rangema > 3.70611 )
						ret := -0.200000
				if( priceRange > 3.76086 )
					if( lowerBB <= 193.594 )
						if( lowerKC <= 194.327 )
							ret := -0.500000
						if( lowerKC > 194.327 )
							ret := -1.000000 // sell
					if( lowerBB > 193.594 )
						ret := 1.000000 // buy
			if( lowerKC > 195.915 )
				if( rangema <= 0.948937 )
					if( lowerBB <= 198.248 )
						if( ma <= 198.782 )
							if( upperBB <= 199.323 )
								if( upperBB <= 199.142 )
									ret := 0.200000
								if( upperBB > 199.142 )
									ret := 0.909091 // buy
							if( upperBB > 199.323 )
								if( lowerBB <= 197.521 )
									ret := 0.240000
								if( lowerBB > 197.521 )
									ret := -0.333333
						if( ma > 198.782 )
							if( avgHighLow <= 198.007 )
								if( val <= -0.08717 )
									ret := -1.000000 // sell
								if( val > -0.08717 )
									ret := 0.000000
							if( avgHighLow > 198.007 )
								if( avgHighLow <= 199.722 )
									ret := 0.666667
								if( avgHighLow > 199.722 )
									ret := -0.125000
					if( lowerBB > 198.248 )
						if( basis <= 199.303 )
							if( upperBB <= 199.414 )
								ret := 1.000000 // buy
							if( upperBB > 199.414 )
								if( priceRange <= 1.06884 )
									ret := -0.593220
								if( priceRange > 1.06884 )
									ret := 0.500000
						if( basis > 199.303 )
							if( upperBB <= 200.145 )
								if( basis <= 199.368 )
									ret := 0.750000 // buy
								if( basis > 199.368 )
									ret := 1.000000 // buy
							if( upperBB > 200.145 )
								if( priceRange <= 1.1725 )
									ret := 0.280702
								if( priceRange > 1.1725 )
									ret := -0.411765
				if( rangema > 0.948937 )
					if( lowerBB <= 195.589 )
						if( priceRange <= 3.25115 )
							if( upperBB <= 200.45 )
								ret := -1.000000 // sell
							if( upperBB > 200.45 )
								if( basis <= 198.269 )
									ret := 0.500000
								if( basis > 198.269 )
									ret := 0.958333 // buy
						if( priceRange > 3.25115 )
							if( rangema <= 2.06361 )
								ret := -1.000000 // sell
							if( rangema > 2.06361 )
								ret := -0.500000
					if( lowerBB > 195.589 )
						if( lowerBB <= 198.105 )
							if( dev <= 1.06097 )
								ret := 0.857143 // buy
							if( dev > 1.06097 )
								if( upperKC <= 199.778 )
									ret := -0.825000 // sell
								if( upperKC > 199.778 )
									ret := -0.227848
						if( lowerBB > 198.105 )
							if( basis <= 200.624 )
								if( upperBB <= 201.662 )
									ret := 0.166667
								if( upperBB > 201.662 )
									ret := 1.000000 // buy
							if( basis > 200.624 )
								if( lowerBB <= 198.844 )
									ret := -0.250000
								if( lowerBB > 198.844 )
									ret := -1.000000 // sell
	if( avgHighLow > 199.838 )
		if( avgHighLow <= 203.717 )
			if( upperKC <= 205.127 )
				if( dev <= 7.0748 )
					if( lowerKC <= 199.36 )
						if( upperBB <= 200.196 )
							if( val <= 0.023342 )
								ret := 0.500000
							if( val > 0.023342 )
								ret := 1.000000 // buy
						if( upperBB > 200.196 )
							if( upperBB <= 201.561 )
								if( lowerBB <= 198.619 )
									ret := -0.204819
								if( lowerBB > 198.619 )
									ret := -0.724771 // sell
							if( upperBB > 201.561 )
								if( priceRange <= 0.864719 )
									ret := -0.330709
								if( priceRange > 0.864719 )
									ret := 0.090909
					if( lowerKC > 199.36 )
						if( upperKC <= 202.848 )
							if( upperBB <= 202.951 )
								if( upperKC <= 202.309 )
									ret := 0.220264
								if( upperKC > 202.309 )
									ret := -0.326241
							if( upperBB > 202.951 )
								if( val <= 0.11789 )
									ret := 0.536585
								if( val > 0.11789 )
									ret := -0.085714
						if( upperKC > 202.848 )
							if( basis <= 201.891 )
								if( upperKC <= 203.034 )
									ret := -0.329412
								if( upperKC > 203.034 )
									ret := -0.783133 // sell
							if( basis > 201.891 )
								if( upperBB <= 203.141 )
									ret := 0.547619
								if( upperBB > 203.141 )
									ret := -0.091416
				if( dev > 7.0748 )
					ret := 1.000000 // buy
			if( upperKC > 205.127 )
				if( ma <= 202.686 )
					if( basis <= 201.964 )
						ret := -0.250000
					if( basis > 201.964 )
						if( val <= -0.299122 )
							ret := -0.500000
						if( val > -0.299122 )
							if( priceRange <= 2.19003 )
								ret := -1.000000 // sell
							if( priceRange > 2.19003 )
								ret := -0.750000 // sell
				if( ma > 202.686 )
					if( upperBB <= 205.996 )
						if( val <= 0.117922 )
							if( dev <= 0.793448 )
								ret := 0.000000
							if( dev > 0.793448 )
								if( upperBB <= 205.133 )
									ret := 0.000000
								if( upperBB > 205.133 )
									ret := -0.843750 // sell
						if( val > 0.117922 )
							if( upperBB <= 205.835 )
								if( upperKC <= 205.907 )
									ret := 1.000000 // buy
								if( upperKC > 205.907 )
									ret := 0.000000
							if( upperBB > 205.835 )
								ret := -1.000000 // sell
					if( upperBB > 205.996 )
						if( upperKC <= 206.287 )
							if( priceRange <= 0.680503 )
								if( upperBB <= 206.427 )
									ret := -1.000000 // sell
								if( upperBB > 206.427 )
									ret := 0.000000
							if( priceRange > 0.680503 )
								if( avgHighLow <= 201.901 )
									ret := -0.500000
								if( avgHighLow > 201.901 )
									ret := 0.700000 // buy
						if( upperKC > 206.287 )
							if( lowerKC <= 199.837 )
								ret := -1.000000 // sell
							if( lowerKC > 199.837 )
								if( val <= -0.312567 )
									ret := 0.416667
								if( val > -0.312567 )
									ret := -0.652174
		if( avgHighLow > 203.717 )
			if( upperKC <= 231.135 )
				if( lowerKC <= 216.635 )
					if( ma <= 214.012 )
						if( sqzOnInt <= 0.5 )
							if( basis <= 213.3 )
								if( upperKC <= 213.213 )
									ret := 0.134772
								if( upperKC > 213.213 )
									ret := -0.226415
							if( basis > 213.3 )
								if( basis <= 213.86 )
									ret := 0.729730 // buy
								if( basis > 213.86 )
									ret := -0.111111
						if( sqzOnInt > 0.5 )
							if( lowerKC <= 210.526 )
								if( avgHighLow <= 209.061 )
									ret := -0.054381
								if( avgHighLow > 209.061 )
									ret := -0.483444
							if( lowerKC > 210.526 )
								if( ma <= 211.967 )
									ret := 0.857143 // buy
								if( ma > 211.967 )
									ret := 0.058824
					if( ma > 214.012 )
						if( basis <= 218.076 )
							if( lowerKC <= 216.073 )
								if( upperBB <= 215.127 )
									ret := -0.750000 // sell
								if( upperBB > 215.127 )
									ret := -0.253165
							if( lowerKC > 216.073 )
								if( rangema <= 0.829372 )
									ret := -0.400000
								if( rangema > 0.829372 )
									ret := -0.955556 // sell
						if( basis > 218.076 )
							if( avgHighLow <= 217.228 )
								if( upperBB <= 220.931 )
									ret := 1.000000 // buy
								if( upperBB > 220.931 )
									ret := 0.750000 // buy
							if( avgHighLow > 217.228 )
								ret := 0.000000
				if( lowerKC > 216.635 )
					if( dev <= 1.47375 )
						if( avgHighLow <= 223.977 )
							if( upperKC <= 220.077 )
								if( val <= 0.001586 )
									ret := 0.646465
								if( val > 0.001586 )
									ret := 0.189655
							if( upperKC > 220.077 )
								if( dev <= 0.921437 )
									ret := -0.136364
								if( dev > 0.921437 )
									ret := 0.244444
						if( avgHighLow > 223.977 )
							if( upperBB <= 226.561 )
								if( dev <= 1.0124 )
									ret := 0.951220 // buy
								if( dev > 1.0124 )
									ret := 0.583333
							if( upperBB > 226.561 )
								if( avgHighLow <= 229.039 )
									ret := 0.213115
								if( avgHighLow > 229.039 )
									ret := 0.617647
					if( dev > 1.47375 )
						if( lowerKC <= 217.483 )
							if( upperKC <= 221.049 )
								ret := 0.333333
							if( upperKC > 221.049 )
								if( lowerKC <= 217.181 )
									ret := 0.666667
								if( lowerKC > 217.181 )
									ret := 1.000000 // buy
						if( lowerKC > 217.483 )
							if( lowerKC <= 220.185 )
								if( avgHighLow <= 220.389 )
									ret := 0.182927
								if( avgHighLow > 220.389 )
									ret := -0.715789 // sell
							if( lowerKC > 220.185 )
								if( upperBB <= 229.379 )
									ret := 0.244382
								if( upperBB > 229.379 )
									ret := -0.212560
			if( upperKC > 231.135 )
				if( lowerKC <= 229.471 )
					if( sqzOnInt <= 0.5 )
						if( lowerBB <= 227.878 )
							if( upperBB <= 232.395 )
								if( priceRange <= 0.675463 )
									ret := 0.750000 // buy
								if( priceRange > 0.675463 )
									ret := -0.250000
							if( upperBB > 232.395 )
								if( dev <= 5.05691 )
									ret := -0.304348
								if( dev > 5.05691 )
									ret := -0.812500 // sell
						if( lowerBB > 227.878 )
							if( val <= 0.086561 )
								if( ma <= 230.813 )
									ret := -0.918367 // sell
								if( ma > 230.813 )
									ret := -0.500000
							if( val > 0.086561 )
								ret := 0.000000
					if( sqzOnInt > 0.5 )
						if( val <= -0.072569 )
							if( upperKC <= 231.781 )
								ret := -1.000000 // sell
							if( upperKC > 231.781 )
								ret := -0.285714
						if( val > -0.072569 )
							if( upperKC <= 232.212 )
								if( upperBB <= 230.982 )
									ret := -0.250000
								if( upperBB > 230.982 )
									ret := 0.475000
							if( upperKC > 232.212 )
								ret := -0.800000 // sell
				if( lowerKC > 229.471 )
					if( dev <= 1.50915 )
						if( basis <= 231.973 )
							if( lowerBB <= 229.317 )
								ret := -1.000000 // sell
							if( lowerBB > 229.317 )
								if( avgHighLow <= 231.734 )
									ret := 0.812500 // buy
								if( avgHighLow > 231.734 )
									ret := -0.214286
						if( basis > 231.973 )
							if( avgHighLow <= 239.57 )
								if( priceRange <= 1.27472 )
									ret := -0.685567
								if( priceRange > 1.27472 )
									ret := -0.236842
							if( avgHighLow > 239.57 )
								if( lowerBB <= 246.402 )
									ret := 0.121739
								if( lowerBB > 246.402 )
									ret := -0.857143 // sell
					if( dev > 1.50915 )
						if( upperBB <= 236.234 )
							if( rangema <= 1.37641 )
								if( val <= -0.141186 )
									ret := -0.250000
								if( val > -0.141186 )
									ret := 0.310976
							if( rangema > 1.37641 )
								ret := 1.000000 // buy
						if( upperBB > 236.234 )
							if( upperBB <= 238.617 )
								if( upperKC <= 236.556 )
									ret := 0.148936
								if( upperKC > 236.556 )
									ret := -0.465116
							if( upperBB > 238.617 )
								if( lowerBB <= 234.229 )
									ret := 0.800000 // buy
								if( lowerBB > 234.229 )
									ret := -0.042169
	
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
float op_operation = decision_tree_0_FFIV_15Min_d5c2a93f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


