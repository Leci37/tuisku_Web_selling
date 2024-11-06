//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: SHOP_15Min_1SQU_09cd9788 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_15Min_1SQU_09cd9788", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_15Min_09cd9788(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( val <= 1.40565 )
		if( upperBB <= 1532.6 )
			if( upperKC <= 29.0287 )
				if( lowerBB <= 27.0291 )
					if( avgHighLow <= 27.1267 )
						if( lowerBB <= 24.8364 )
							if( rangema <= 0.413007 )
								if( priceRange <= 0.653569 )
									ret := 1.000000 // buy
								if( priceRange > 0.653569 )
									ret := 0.750000 // buy
							if( rangema > 0.413007 )
								if( upperBB <= 26.4212 )
									ret := 0.764706 // buy
								if( upperBB > 26.4212 )
									ret := -0.400000
						if( lowerBB > 24.8364 )
							if( rangema <= 0.291763 )
								if( ma <= 26.4345 )
									ret := 0.072464
								if( ma > 26.4345 )
									ret := 0.546099
							if( rangema > 0.291763 )
								if( val <= -0.003727 )
									ret := 0.550000
								if( val > -0.003727 )
									ret := -0.643836
					if( avgHighLow > 27.1267 )
						if( lowerBB <= 26.4658 )
							ret := 0.833333 // buy
						if( lowerBB > 26.4658 )
							if( avgHighLow <= 27.254 )
								if( lowerKC <= 26.804 )
									ret := -0.700000 // sell
								if( lowerKC > 26.804 )
									ret := -1.000000 // sell
							if( avgHighLow > 27.254 )
								if( rangema <= 0.225052 )
									ret := -0.083333
								if( rangema > 0.225052 )
									ret := -0.525000
				if( lowerBB > 27.0291 )
					if( dev <= 0.138793 )
						if( basis <= 28.641 )
							if( lowerBB <= 28.5339 )
								if( val <= -0.00561 )
									ret := 0.222222
								if( val > -0.00561 )
									ret := -0.814815 // sell
							if( lowerBB > 28.5339 )
								ret := 0.500000
						if( basis > 28.641 )
							if( avgHighLow <= 28.6799 )
								ret := 0.200000
							if( avgHighLow > 28.6799 )
								ret := 1.000000 // buy
					if( dev > 0.138793 )
						if( dev <= 0.687231 )
							if( basis <= 28.7139 )
								if( val <= 0.027029 )
									ret := 0.603723
								if( val > 0.027029 )
									ret := 0.238806
							if( basis > 28.7139 )
								if( lowerBB <= 28.4179 )
									ret := -1.000000 // sell
								if( lowerBB > 28.4179 )
									ret := 0.083333
						if( dev > 0.687231 )
							if( avgHighLow <= 28.4149 )
								if( rangema <= 0.306889 )
									ret := -1.000000 // sell
								if( rangema > 0.306889 )
									ret := 0.250000
							if( avgHighLow > 28.4149 )
								if( val <= -0.032354 )
									ret := 0.750000 // buy
								if( val > -0.032354 )
									ret := 0.000000
			if( upperKC > 29.0287 )
				if( upperKC <= 30.8365 )
					if( dev <= 0.805604 )
						if( lowerBB <= 30.0325 )
							if( lowerKC <= 28.6848 )
								if( lowerKC <= 28.399 )
									ret := 0.067416
								if( lowerKC > 28.399 )
									ret := -0.500000
							if( lowerKC > 28.6848 )
								if( val <= -0.045443 )
									ret := -0.545455
								if( val > -0.045443 )
									ret := 0.130326
						if( lowerBB > 30.0325 )
							if( lowerBB <= 30.1496 )
								if( upperKC <= 30.662 )
									ret := -0.826087 // sell
								if( upperKC > 30.662 )
									ret := 0.000000
							if( lowerBB > 30.1496 )
								if( upperBB <= 30.6656 )
									ret := -0.875000 // sell
								if( upperBB > 30.6656 )
									ret := -1.000000 // sell
					if( dev > 0.805604 )
						if( priceRange <= 0.377527 )
							if( lowerKC <= 28.3713 )
								ret := -0.166667
							if( lowerKC > 28.3713 )
								if( rangema <= 0.41782 )
									ret := -0.875000 // sell
								if( rangema > 0.41782 )
									ret := -0.250000
						if( priceRange > 0.377527 )
							if( val <= 0.048912 )
								if( lowerKC <= 28.6452 )
									ret := 0.333333
								if( lowerKC > 28.6452 )
									ret := 0.900000 // buy
							if( val > 0.048912 )
								ret := -0.166667
				if( upperKC > 30.8365 )
					if( val <= -2.3329 )
						if( lowerBB <= 1297.02 )
							if( upperBB <= 415.915 )
								if( priceRange <= 3.44502 )
									ret := -0.538462
								if( priceRange > 3.44502 )
									ret := 0.870968 // buy
							if( upperBB > 415.915 )
								if( upperBB <= 664.921 )
									ret := -0.849057 // sell
								if( upperBB > 664.921 )
									ret := -0.241313
						if( lowerBB > 1297.02 )
							if( lowerBB <= 1354.13 )
								if( rangema <= 13.9404 )
									ret := 0.153846
								if( rangema > 13.9404 )
									ret := 0.914894 // buy
							if( lowerBB > 1354.13 )
								if( avgHighLow <= 1420.47 )
									ret := -0.647059
								if( avgHighLow > 1420.47 )
									ret := -0.029412
					if( val > -2.3329 )
						if( lowerBB <= 30.039 )
							if( lowerBB <= 28.0195 )
								ret := -0.600000
							if( lowerBB > 28.0195 )
								if( avgHighLow <= 30.1917 )
									ret := -0.125000
								if( avgHighLow > 30.1917 )
									ret := 0.796992 // buy
						if( lowerBB > 30.039 )
							if( rangema <= 0.262368 )
								if( priceRange <= 0.332442 )
									ret := 0.035852
								if( priceRange > 0.332442 )
									ret := -0.030781
							if( rangema > 0.262368 )
								if( avgHighLow <= 31.7365 )
									ret := 0.329843
								if( avgHighLow > 31.7365 )
									ret := 0.060702
		if( upperBB > 1532.6 )
			if( dev <= 12.8064 )
				if( basis <= 1544.51 )
					if( val <= 0.294698 )
						if( priceRange <= 6.7525 )
							if( upperKC <= 1547.31 )
								if( lowerBB <= 1533.34 )
									ret := -0.266667
								if( lowerBB > 1533.34 )
									ret := -0.833333 // sell
							if( upperKC > 1547.31 )
								if( lowerKC <= 1534.86 )
									ret := 0.000000
								if( lowerKC > 1534.86 )
									ret := -0.250000
						if( priceRange > 6.7525 )
							if( upperKC <= 1541.05 )
								if( upperKC <= 1534.2 )
									ret := -0.500000
								if( upperKC > 1534.2 )
									ret := 0.000000
							if( upperKC > 1541.05 )
								if( rangema <= 6.41264 )
									ret := -0.565217
								if( rangema > 6.41264 )
									ret := -0.851064 // sell
					if( val > 0.294698 )
						if( upperBB <= 1535.91 )
							if( ma <= 1523.71 )
								ret := 0.000000
							if( ma > 1523.71 )
								if( priceRange <= 4.225 )
									ret := -1.000000 // sell
								if( priceRange > 4.225 )
									ret := -0.142857
						if( upperBB > 1535.91 )
							if( lowerKC <= 1523.92 )
								if( priceRange <= 6.7725 )
									ret := 0.000000
								if( priceRange > 6.7725 )
									ret := 0.777778 // buy
							if( lowerKC > 1523.92 )
								if( lowerKC <= 1524.57 )
									ret := -0.750000 // sell
								if( lowerKC > 1524.57 )
									ret := 0.038462
				if( basis > 1544.51 )
					if( upperBB <= 1627.97 )
						if( dev <= 6.48528 )
							if( lowerBB <= 1540.86 )
								ret := 1.000000 // buy
							if( lowerBB > 1540.86 )
								if( val <= -0.722704 )
									ret := 0.000000
								if( val > -0.722704 )
									ret := 0.666667
						if( dev > 6.48528 )
							if( lowerKC <= 1550.82 )
								if( avgHighLow <= 1542.59 )
									ret := 0.727273 // buy
								if( avgHighLow > 1542.59 )
									ret := -0.319149
							if( lowerKC > 1550.82 )
								if( upperBB <= 1580.73 )
									ret := 0.769231 // buy
								if( upperBB > 1580.73 )
									ret := 0.047619
					if( upperBB > 1627.97 )
						if( upperKC <= 1693.17 )
							if( rangema <= 7.26989 )
								if( dev <= 8.29417 )
									ret := 1.000000 // buy
								if( dev > 8.29417 )
									ret := 0.742857 // buy
							if( rangema > 7.26989 )
								if( dev <= 9.75489 )
									ret := 0.000000
								if( dev > 9.75489 )
									ret := 0.714286 // buy
						if( upperKC > 1693.17 )
							ret := -0.250000
			if( dev > 12.8064 )
				if( priceRange <= 12.8897 )
					if( lowerBB <= 1691.97 )
						if( lowerBB <= 1667.66 )
							if( avgHighLow <= 1517.62 )
								if( avgHighLow <= 1501.84 )
									ret := 0.384615
								if( avgHighLow > 1501.84 )
									ret := -0.597561
							if( avgHighLow > 1517.62 )
								if( avgHighLow <= 1520.83 )
									ret := 0.636364
								if( avgHighLow > 1520.83 )
									ret := -0.097015
						if( lowerBB > 1667.66 )
							if( rangema <= 9.41318 )
								if( lowerBB <= 1677.54 )
									ret := 1.000000 // buy
								if( lowerBB > 1677.54 )
									ret := 0.500000
							if( rangema > 9.41318 )
								ret := 0.142857
					if( lowerBB > 1691.97 )
						if( val <= -3.82909 )
							ret := -0.750000 // sell
						if( val > -3.82909 )
							ret := -1.000000 // sell
				if( priceRange > 12.8897 )
					if( val <= 1.28519 )
						if( rangema <= 14.7308 )
							if( dev <= 15.3909 )
								if( rangema <= 8.16438 )
									ret := -0.411765
								if( rangema > 8.16438 )
									ret := 0.533333
							if( dev > 15.3909 )
								if( ma <= 1575.97 )
									ret := -0.521277
								if( ma > 1575.97 )
									ret := -0.841584 // sell
						if( rangema > 14.7308 )
							if( lowerKC <= 1504.91 )
								if( dev <= 30.4281 )
									ret := -1.000000 // sell
								if( dev > 30.4281 )
									ret := -0.750000 // sell
							if( lowerKC > 1504.91 )
								if( lowerBB <= 1586.98 )
									ret := 0.227273
								if( lowerBB > 1586.98 )
									ret := -0.750000 // sell
					if( val > 1.28519 )
						ret := 0.600000
	if( val > 1.40565 )
		if( upperKC <= 451.375 )
			if( priceRange <= 3.60543 )
				if( sqzOffInt <= 0.5 )
					ret := -1.000000 // sell
				if( sqzOffInt > 0.5 )
					if( upperBB <= 369.925 )
						if( lowerKC <= 34.0338 )
							if( rangema <= 0.626985 )
								if( upperKC <= 35.2312 )
									ret := -1.000000 // sell
								if( upperKC > 35.2312 )
									ret := -0.750000 // sell
							if( rangema > 0.626985 )
								ret := 0.000000
						if( lowerKC > 34.0338 )
							if( upperKC <= 337.217 )
								ret := 1.000000 // buy
							if( upperKC > 337.217 )
								if( rangema <= 5.22429 )
									ret := 0.600000
								if( rangema > 5.22429 )
									ret := -0.333333
					if( upperBB > 369.925 )
						if( dev <= 18.3328 )
							ret := -1.000000 // sell
						if( dev > 18.3328 )
							ret := -0.200000
			if( priceRange > 3.60543 )
				if( lowerKC <= 418.968 )
					if( lowerBB <= 400.022 )
						if( ma <= 353.373 )
							if( dev <= 35.0305 )
								if( lowerKC <= 329.534 )
									ret := -0.857143 // sell
								if( lowerKC > 329.534 )
									ret := -1.000000 // sell
							if( dev > 35.0305 )
								ret := 0.000000
						if( ma > 353.373 )
							if( upperBB <= 395.41 )
								if( priceRange <= 11.6509 )
									ret := 0.250000
								if( priceRange > 11.6509 )
									ret := -1.000000 // sell
							if( upperBB > 395.41 )
								if( rangema <= 7.44095 )
									ret := -0.880000 // sell
								if( rangema > 7.44095 )
									ret := -0.333333
					if( lowerBB > 400.022 )
						ret := 0.666667
				if( lowerKC > 418.968 )
					ret := -1.000000 // sell
		if( upperKC > 451.375 )
			if( dev <= 29.6147 )
				if( basis <= 1170.84 )
					if( ma <= 1081.78 )
						if( dev <= 13.8919 )
							if( upperBB <= 989.655 )
								if( dev <= 12.4263 )
									ret := 0.046512
								if( dev > 12.4263 )
									ret := -0.633333
							if( upperBB > 989.655 )
								if( upperKC <= 1026.31 )
									ret := -0.811321 // sell
								if( upperKC > 1026.31 )
									ret := -0.233766
						if( dev > 13.8919 )
							if( upperKC <= 544.692 )
								if( rangema <= 7.78608 )
									ret := 1.000000 // buy
								if( rangema > 7.78608 )
									ret := 0.416667
							if( upperKC > 544.692 )
								if( priceRange <= 11.3371 )
									ret := 0.006369
								if( priceRange > 11.3371 )
									ret := 0.387387
					if( ma > 1081.78 )
						if( avgHighLow <= 1098.21 )
							if( upperKC <= 1105.24 )
								if( basis <= 1093.8 )
									ret := 0.636364
								if( basis > 1093.8 )
									ret := -0.750000 // sell
							if( upperKC > 1105.24 )
								if( lowerBB <= 1085.3 )
									ret := 0.956522 // buy
								if( lowerBB > 1085.3 )
									ret := 0.500000
						if( avgHighLow > 1098.21 )
							if( upperKC <= 1116.25 )
								if( val <= 2.09408 )
									ret := -0.700000 // sell
								if( val > 2.09408 )
									ret := 0.285714
							if( upperKC > 1116.25 )
								if( dev <= 15.1972 )
									ret := 0.081081
								if( dev > 15.1972 )
									ret := 0.526316
				if( basis > 1170.84 )
					if( rangema <= 12.0179 )
						if( priceRange <= 15.6789 )
							if( upperBB <= 1192.49 )
								if( avgHighLow <= 1180.22 )
									ret := -1.000000 // sell
								if( avgHighLow > 1180.22 )
									ret := -0.600000
							if( upperBB > 1192.49 )
								if( upperBB <= 1261.57 )
									ret := -0.350649
								if( upperBB > 1261.57 )
									ret := -0.084475
						if( priceRange > 15.6789 )
							if( avgHighLow <= 1331.86 )
								if( upperBB <= 1262.09 )
									ret := -0.400000
								if( upperBB > 1262.09 )
									ret := 0.600000
							if( avgHighLow > 1331.86 )
								if( upperBB <= 1498.22 )
									ret := -0.902439 // sell
								if( upperBB > 1498.22 )
									ret := -0.290323
					if( rangema > 12.0179 )
						if( upperBB <= 1198.29 )
							ret := -1.000000 // sell
						if( upperBB > 1198.29 )
							if( val <= 2.77981 )
								if( priceRange <= 11.7437 )
									ret := 0.133333
								if( priceRange > 11.7437 )
									ret := 0.743590 // buy
							if( val > 2.77981 )
								if( rangema <= 12.6418 )
									ret := -0.833333 // sell
								if( rangema > 12.6418 )
									ret := 0.260870
			if( dev > 29.6147 )
				if( avgHighLow <= 908.985 )
					if( lowerKC <= 810.094 )
						if( priceRange <= 7.93488 )
							if( val <= 2.06487 )
								if( lowerBB <= 588.469 )
									ret := 0.750000 // buy
								if( lowerBB > 588.469 )
									ret := 1.000000 // buy
							if( val > 2.06487 )
								if( lowerKC <= 679.429 )
									ret := -0.250000
								if( lowerKC > 679.429 )
									ret := 0.000000
						if( priceRange > 7.93488 )
							if( lowerBB <= 787.533 )
								if( rangema <= 8.22297 )
									ret := -0.250000
								if( rangema > 8.22297 )
									ret := -0.941176 // sell
							if( lowerBB > 787.533 )
								ret := -0.200000
					if( lowerKC > 810.094 )
						if( dev <= 34.6232 )
							if( lowerBB <= 868.111 )
								if( avgHighLow <= 858.146 )
									ret := 0.000000
								if( avgHighLow > 858.146 )
									ret := -1.000000 // sell
							if( lowerBB > 868.111 )
								ret := 0.000000
						if( dev > 34.6232 )
							if( val <= 6.13273 )
								if( lowerBB <= 797.098 )
									ret := -0.750000 // sell
								if( lowerBB > 797.098 )
									ret := -0.965116 // sell
							if( val > 6.13273 )
								ret := -0.250000
				if( avgHighLow > 908.985 )
					if( ma <= 955.735 )
						if( rangema <= 11.9335 )
							ret := 1.000000 // buy
						if( rangema > 11.9335 )
							ret := 0.500000
					if( ma > 955.735 )
						if( dev <= 32.9307 )
							if( ma <= 1301.68 )
								if( lowerBB <= 1226.73 )
									ret := -0.187500
								if( lowerBB > 1226.73 )
									ret := -1.000000 // sell
							if( ma > 1301.68 )
								if( basis <= 1421.12 )
									ret := 1.000000 // buy
								if( basis > 1421.12 )
									ret := -0.650000
						if( dev > 32.9307 )
							if( val <= 6.86862 )
								if( ma <= 1116.81 )
									ret := -0.141026
								if( ma > 1116.81 )
									ret := 0.228426
							if( val > 6.86862 )
								if( lowerKC <= 1356.79 )
									ret := -0.250000
								if( lowerKC > 1356.79 )
									ret := -0.909091 // sell
	
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
float op_operation = decision_tree_0_SHOP_15Min_09cd9788(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


