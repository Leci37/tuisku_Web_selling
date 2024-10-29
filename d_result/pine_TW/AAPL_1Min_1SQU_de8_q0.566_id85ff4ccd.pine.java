//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: AAPL_1Min_1SQU_85ff4ccd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_1SQU_85ff4ccd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_85ff4ccd(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( upperBB <= 229.404 )
		if( val <= -0.01317 )
			if( lowerBB <= 223.109 )
				if( basis <= 182.492 )
					if( upperKC <= 182.637 )
						if( sqzOnInt <= 0.5 )
							if( upperBB <= 167.049 )
								if( basis <= 166.049 )
									ret := 0.155039
								if( basis > 166.049 )
									ret := 0.613636
							if( upperBB > 167.049 )
								if( basis <= 168.131 )
									ret := -0.255102
								if( basis > 168.131 )
									ret := 0.088190
						if( sqzOnInt > 0.5 )
							if( dev <= 0.197563 )
								if( lowerKC <= 170.581 )
									ret := -0.093458
								if( lowerKC > 170.581 )
									ret := 0.198758
							if( dev > 0.197563 )
								if( avgHighLow <= 173.294 )
									ret := 0.700000 // buy
								if( avgHighLow > 173.294 )
									ret := 0.208791
					if( upperKC > 182.637 )
						if( lowerKC <= 182.027 )
							if( val <= -0.050299 )
								ret := 1.000000 // buy
							if( val > -0.050299 )
								ret := 0.545455
						if( lowerKC > 182.027 )
							if( priceRange <= 0.110373 )
								ret := 0.900000 // buy
							if( priceRange > 0.110373 )
								ret := 1.000000 // buy
				if( basis > 182.492 )
					if( lowerKC <= 189.876 )
						if( lowerBB <= 188.969 )
							if( upperKC <= 182.875 )
								if( sqzOnInt <= 0.5 )
									ret := -0.474227
								if( sqzOnInt > 0.5 )
									ret := -0.805970 // sell
							if( upperKC > 182.875 )
								if( upperKC <= 183.264 )
									ret := 0.708955 // buy
								if( upperKC > 183.264 )
									ret := -0.078460
						if( lowerBB > 188.969 )
							if( upperBB <= 190.053 )
								if( avgHighLow <= 189.777 )
									ret := -0.420000
								if( avgHighLow > 189.777 )
									ret := 0.800000 // buy
							if( upperBB > 190.053 )
								if( basis <= 190.008 )
									ret := -0.841270 // sell
								if( basis > 190.008 )
									ret := 0.071429
					if( lowerKC > 189.876 )
						if( lowerKC <= 213.633 )
							if( basis <= 212.649 )
								if( upperKC <= 212.658 )
									ret := 0.075028
								if( upperKC > 212.658 )
									ret := -0.589091
							if( basis > 212.649 )
								if( upperBB <= 220.553 )
									ret := 0.367347
								if( upperBB > 220.553 )
									ret := -1.000000 // sell
						if( lowerKC > 213.633 )
							if( avgHighLow <= 218.8 )
								if( dev <= 0.247575 )
									ret := 0.158123
								if( dev > 0.247575 )
									ret := -0.137356
							if( avgHighLow > 218.8 )
								if( upperKC <= 219.483 )
									ret := 0.483412
								if( upperKC > 219.483 )
									ret := 0.031068
			if( lowerBB > 223.109 )
				if( avgHighLow <= 224.568 )
					if( sqzOffInt <= 0.5 )
						if( priceRange <= 0.558221 )
							if( lowerKC <= 223.262 )
								if( lowerBB <= 223.161 )
									ret := 0.100000
								if( lowerBB > 223.161 )
									ret := 0.909091 // buy
							if( lowerKC > 223.262 )
								if( lowerBB <= 223.696 )
									ret := -0.688312
								if( lowerBB > 223.696 )
									ret := 0.056497
						if( priceRange > 0.558221 )
							if( avgHighLow <= 223.891 )
								ret := 1.000000 // buy
							if( avgHighLow > 223.891 )
								ret := 0.583333
					if( sqzOffInt > 0.5 )
						if( ma <= 224.453 )
							if( priceRange <= 0.085945 )
								if( val <= -0.026452 )
									ret := 0.733333 // buy
								if( val > -0.026452 )
									ret := 0.472868
							if( priceRange > 0.085945 )
								if( dev <= 0.501953 )
									ret := 0.402256
								if( dev > 0.501953 )
									ret := 0.017442
						if( ma > 224.453 )
							if( rangema <= 0.218001 )
								if( rangema <= 0.11213 )
									ret := -0.047619
								if( rangema > 0.11213 )
									ret := 0.571429
							if( rangema > 0.218001 )
								if( lowerBB <= 224.088 )
									ret := 0.991071 // buy
								if( lowerBB > 224.088 )
									ret := 0.666667
				if( avgHighLow > 224.568 )
					if( upperKC <= 225.592 )
						if( upperKC <= 225.252 )
							if( sqzOnInt <= 0.5 )
								if( upperKC <= 224.816 )
									ret := -0.600000
								if( upperKC > 224.816 )
									ret := 0.216867
							if( sqzOnInt > 0.5 )
								if( upperKC <= 225.028 )
									ret := -0.041322
								if( upperKC > 225.028 )
									ret := -0.433735
						if( upperKC > 225.252 )
							if( dev <= 0.345592 )
								if( sqzOnInt <= 0.5 )
									ret := 0.150000
								if( sqzOnInt > 0.5 )
									ret := -0.375000
							if( dev > 0.345592 )
								if( basis <= 224.841 )
									ret := 0.045455
								if( basis > 224.841 )
									ret := -0.593607
					if( upperKC > 225.592 )
						if( upperBB <= 226.463 )
							if( avgHighLow <= 226.045 )
								if( upperBB <= 226.113 )
									ret := 0.254197
								if( upperBB > 226.113 )
									ret := 0.517647
							if( avgHighLow > 226.045 )
								if( dev <= 0.271372 )
									ret := 0.250000
								if( dev > 0.271372 )
									ret := -0.509091
						if( upperBB > 226.463 )
							if( basis <= 226.516 )
								if( avgHighLow <= 225.235 )
									ret := 0.872340 // buy
								if( avgHighLow > 225.235 )
									ret := -0.246177
							if( basis > 226.516 )
								if( upperBB <= 228.782 )
									ret := 0.181695
								if( upperBB > 228.782 )
									ret := -0.040373
		if( val > -0.01317 )
			if( upperKC <= 164.62 )
				if( priceRange <= 0.091345 )
					if( ma <= 164.392 )
						ret := -0.200000
					if( ma > 164.392 )
						if( dev <= 0.088255 )
							ret := 1.000000 // buy
						if( dev > 0.088255 )
							ret := -0.181818
				if( priceRange > 0.091345 )
					if( upperBB <= 164.433 )
						ret := 0.875000 // buy
					if( upperBB > 164.433 )
						ret := 1.000000 // buy
			if( upperKC > 164.62 )
				if( rangema <= 0.897157 )
					if( dev <= 2.09058 )
						if( lowerBB <= 228.798 )
							if( upperBB <= 229.073 )
								if( val <= 0.198282 )
									ret := -0.011892
								if( val > 0.198282 )
									ret := -0.883333 // sell
							if( upperBB > 229.073 )
								if( avgHighLow <= 228.849 )
									ret := -0.557447
								if( avgHighLow > 228.849 )
									ret := -0.062016
						if( lowerBB > 228.798 )
							if( lowerKC <= 229.039 )
								if( avgHighLow <= 229.118 )
									ret := 0.259174
								if( avgHighLow > 229.118 )
									ret := 0.684685
							if( lowerKC > 229.039 )
								if( upperKC <= 229.337 )
									ret := 0.140541
								if( upperKC > 229.337 )
									ret := -0.716667 // sell
					if( dev > 2.09058 )
						if( rangema <= 0.811374 )
							if( ma <= 211.528 )
								if( avgHighLow <= 176.495 )
									ret := 0.454545
								if( avgHighLow > 176.495 )
									ret := 0.974576 // buy
							if( ma > 211.528 )
								ret := 0.333333
						if( rangema > 0.811374 )
							ret := -1.000000 // sell
				if( rangema > 0.897157 )
					if( basis <= 216.687 )
						if( upperKC <= 213.004 )
							if( priceRange <= 0.383345 )
								if( priceRange <= 0.242863 )
									ret := 0.000000
								if( priceRange > 0.242863 )
									ret := -0.857143 // sell
							if( priceRange > 0.383345 )
								if( lowerBB <= 208.35 )
									ret := 0.609589
								if( lowerBB > 208.35 )
									ret := -0.875000 // sell
						if( upperKC > 213.004 )
							if( basis <= 216.291 )
								if( lowerBB <= 213.261 )
									ret := 1.000000 // buy
								if( lowerBB > 213.261 )
									ret := 0.840000 // buy
							if( basis > 216.291 )
								ret := 0.600000
					if( basis > 216.687 )
						if( avgHighLow <= 216.698 )
							ret := -1.000000 // sell
						if( avgHighLow > 216.698 )
							if( lowerKC <= 216.051 )
								if( priceRange <= 2.28489 )
									ret := -0.035714
								if( priceRange > 2.28489 )
									ret := -0.866667 // sell
							if( lowerKC > 216.051 )
								if( val <= 0.121706 )
									ret := 0.333333
								if( val > 0.121706 )
									ret := 1.000000 // buy
	if( upperBB > 229.404 )
		if( ma <= 229.622 )
			if( upperKC <= 229.467 )
				if( lowerKC <= 229.158 )
					if( rangema <= 0.166112 )
						if( upperBB <= 229.562 )
							if( rangema <= 0.070161 )
								ret := -1.000000 // sell
							if( rangema > 0.070161 )
								if( avgHighLow <= 229.265 )
									ret := 0.018018
								if( avgHighLow > 229.265 )
									ret := 0.642857
						if( upperBB > 229.562 )
							if( avgHighLow <= 229.339 )
								if( lowerBB <= 228.826 )
									ret := 0.818182 // buy
								if( lowerBB > 228.826 )
									ret := 0.461538
							if( avgHighLow > 229.339 )
								ret := -0.916667 // sell
					if( rangema > 0.166112 )
						if( priceRange <= 0.299691 )
							if( dev <= 0.52418 )
								if( ma <= 229.058 )
									ret := 0.066667
								if( ma > 229.058 )
									ret := -0.636364
							if( dev > 0.52418 )
								if( val <= -0.063444 )
									ret := 0.250000
								if( val > -0.063444 )
									ret := -0.883117 // sell
						if( priceRange > 0.299691 )
							if( val <= 0.071163 )
								if( lowerKC <= 228.087 )
									ret := 0.722222 // buy
								if( lowerKC > 228.087 )
									ret := 0.107143
							if( val > 0.071163 )
								ret := 1.000000 // buy
				if( lowerKC > 229.158 )
					if( rangema <= 0.090713 )
						if( dev <= 0.102874 )
							ret := -0.333333
						if( dev > 0.102874 )
							if( lowerBB <= 229.1 )
								ret := -1.000000 // sell
							if( lowerBB > 229.1 )
								if( avgHighLow <= 229.274 )
									ret := -0.444444
								if( avgHighLow > 229.274 )
									ret := -0.884615 // sell
					if( rangema > 0.090713 )
						ret := 0.272727
			if( upperKC > 229.467 )
				if( val <= -0.002776 )
					if( upperBB <= 230.678 )
						if( upperBB <= 229.488 )
							if( upperBB <= 229.434 )
								ret := -0.750000 // sell
							if( upperBB > 229.434 )
								ret := -1.000000 // sell
						if( upperBB > 229.488 )
							if( rangema <= 0.146877 )
								if( dev <= 0.17103 )
									ret := -0.080000
								if( dev > 0.17103 )
									ret := -0.482759
							if( rangema > 0.146877 )
								if( val <= -0.027196 )
									ret := -0.632530
								if( val > -0.027196 )
									ret := -0.884354 // sell
					if( upperBB > 230.678 )
						ret := 0.076923
				if( val > -0.002776 )
					if( upperKC <= 229.872 )
						if( rangema <= 0.143823 )
							if( ma <= 229.347 )
								ret := 0.333333
							if( ma > 229.347 )
								if( upperKC <= 229.54 )
									ret := -1.000000 // sell
								if( upperKC > 229.54 )
									ret := -0.366972
						if( rangema > 0.143823 )
							if( priceRange <= 0.386724 )
								if( lowerKC <= 229.025 )
									ret := -0.650000
								if( lowerKC > 229.025 )
									ret := 0.260870
							if( priceRange > 0.386724 )
								if( lowerKC <= 229.034 )
									ret := 0.840909 // buy
								if( lowerKC > 229.034 )
									ret := 0.272727
					if( upperKC > 229.872 )
						if( sqzOnInt <= 0.5 )
							if( dev <= 0.857963 )
								if( dev <= 0.379823 )
									ret := -1.000000 // sell
								if( dev > 0.379823 )
									ret := -0.250000
							if( dev > 0.857963 )
								if( avgHighLow <= 229.45 )
									ret := -1.000000 // sell
								if( avgHighLow > 229.45 )
									ret := -0.800000 // sell
						if( sqzOnInt > 0.5 )
							ret := 0.642857
		if( ma > 229.622 )
			if( lowerKC <= 229.826 )
				if( basis <= 230.115 )
					if( rangema <= 0.241833 )
						if( dev <= 0.122151 )
							if( lowerKC <= 229.744 )
								if( avgHighLow <= 229.762 )
									ret := -0.428571
								if( avgHighLow > 229.762 )
									ret := -1.000000 // sell
							if( lowerKC > 229.744 )
								ret := 0.583333
						if( dev > 0.122151 )
							if( upperBB <= 230.212 )
								if( rangema <= 0.190415 )
									ret := 0.335106
								if( rangema > 0.190415 )
									ret := 0.887324 // buy
							if( upperBB > 230.212 )
								if( upperBB <= 230.462 )
									ret := 0.681818
								if( upperBB > 230.462 )
									ret := 0.888889 // buy
					if( rangema > 0.241833 )
						if( upperBB <= 231 )
							if( lowerBB <= 229.609 )
								if( dev <= 0.59403 )
									ret := 0.704918 // buy
								if( dev > 0.59403 )
									ret := 0.068376
							if( lowerBB > 229.609 )
								if( rangema <= 0.423841 )
									ret := -0.527473
								if( rangema > 0.423841 )
									ret := 0.666667
						if( upperBB > 231 )
							if( rangema <= 0.512302 )
								if( upperKC <= 230.713 )
									ret := -0.968750 // sell
								if( upperKC > 230.713 )
									ret := -0.583333
							if( rangema > 0.512302 )
								if( priceRange <= 0.523479 )
									ret := -0.636364
								if( priceRange > 0.523479 )
									ret := 0.875000 // buy
				if( basis > 230.115 )
					if( rangema <= 0.341664 )
						if( ma <= 230.171 )
							ret := -0.300000
						if( ma > 230.171 )
							if( avgHighLow <= 230.111 )
								if( upperKC <= 230.57 )
									ret := 0.941176 // buy
								if( upperKC > 230.57 )
									ret := 0.538462
							if( avgHighLow > 230.111 )
								if( lowerKC <= 229.806 )
									ret := -0.400000
								if( lowerKC > 229.806 )
									ret := 0.578947
					if( rangema > 0.341664 )
						if( priceRange <= 0.74271 )
							if( avgHighLow <= 230.349 )
								if( priceRange <= 0.281459 )
									ret := -0.058824
								if( priceRange > 0.281459 )
									ret := 0.587302
							if( avgHighLow > 230.349 )
								if( dev <= 0.915095 )
									ret := -0.950820 // sell
								if( dev > 0.915095 )
									ret := 0.243243
						if( priceRange > 0.74271 )
							if( lowerBB <= 229.414 )
								ret := -1.000000 // sell
							if( lowerBB > 229.414 )
								ret := -0.700000 // sell
			if( lowerKC > 229.826 )
				if( upperBB <= 235.957 )
					if( sqzOffInt <= 0.5 )
						if( lowerKC <= 232.482 )
							if( priceRange <= 0.129188 )
								if( upperBB <= 231.83 )
									ret := 0.156118
								if( upperBB > 231.83 )
									ret := -0.305755
							if( priceRange > 0.129188 )
								if( upperKC <= 231.891 )
									ret := 0.037565
								if( upperKC > 231.891 )
									ret := -0.387550
						if( lowerKC > 232.482 )
							if( priceRange <= 0.208945 )
								if( lowerKC <= 234.043 )
									ret := 0.315068
								if( lowerKC > 234.043 )
									ret := -0.156757
							if( priceRange > 0.208945 )
								if( lowerKC <= 234.222 )
									ret := 0.593750
								if( lowerKC > 234.222 )
									ret := 0.203252
					if( sqzOffInt > 0.5 )
						if( lowerBB <= 230.879 )
							if( upperBB <= 231.993 )
								if( priceRange <= 0.483405 )
									ret := -0.171095
								if( priceRange > 0.483405 )
									ret := 0.833333 // buy
							if( upperBB > 231.993 )
								if( ma <= 230.817 )
									ret := 0.875000 // buy
								if( ma > 230.817 )
									ret := -0.792350 // sell
						if( lowerBB > 230.879 )
							if( val <= 0.029676 )
								if( dev <= 0.7584 )
									ret := -0.038526
								if( dev > 0.7584 )
									ret := -0.827957 // sell
							if( val > 0.029676 )
								if( rangema <= 0.223639 )
									ret := -0.648649
								if( rangema > 0.223639 )
									ret := -0.092593
				if( upperBB > 235.957 )
					if( basis <= 235.31 )
						ret := 0.777778 // buy
					if( basis > 235.31 )
						if( dev <= 0.546328 )
							if( priceRange <= 0.299621 )
								if( ma <= 235.75 )
									ret := -1.000000 // sell
								if( ma > 235.75 )
									ret := -0.600000
							if( priceRange > 0.299621 )
								ret := 0.250000
						if( dev > 0.546328 )
							if( rangema <= 0.471005 )
								ret := -1.000000 // sell
							if( rangema > 0.471005 )
								if( sqzOnInt <= 0.5 )
									ret := -0.642857
								if( sqzOnInt > 0.5 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AAPL_1Min_85ff4ccd(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


