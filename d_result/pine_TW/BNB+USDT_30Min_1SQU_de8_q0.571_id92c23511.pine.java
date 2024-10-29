//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: BNBUSDT_30Min_1SQU_92c23511 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1SQU_92c23511", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_92c23511(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerKC <= 582.103 )
		if( val <= -0.647802 )
			if( ma <= 308.795 )
				if( rangema <= 8.058 )
					if( lowerBB <= 297.481 )
						if( lowerKC <= 121.091 )
							ret := -1.000000 // sell
						if( lowerKC > 121.091 )
							if( rangema <= 3.5125 )
								if( upperBB <= 270.743 )
									ret := -0.741379 // sell
								if( upperBB > 270.743 )
									ret := 0.333333
							if( rangema > 3.5125 )
								if( lowerKC <= 240.513 )
									ret := 0.746154 // buy
								if( lowerKC > 240.513 )
									ret := 0.317857
					if( lowerBB > 297.481 )
						if( ma <= 306.604 )
							if( rangema <= 5.44423 )
								if( sqzOnInt <= 0.5 )
									ret := -0.500000
								if( sqzOnInt > 0.5 )
									ret := -0.965517 // sell
							if( rangema > 5.44423 )
								ret := -0.250000
						if( ma > 306.604 )
							if( avgHighLow <= 307.229 )
								if( lowerBB <= 301.842 )
									ret := -0.200000
								if( lowerBB > 301.842 )
									ret := 0.800000 // buy
							if( avgHighLow > 307.229 )
								if( rangema <= 3.87647 )
									ret := -0.500000
								if( rangema > 3.87647 )
									ret := -1.000000 // sell
				if( rangema > 8.058 )
					if( priceRange <= 16.1979 )
						if( lowerBB <= 283.533 )
							if( priceRange <= 6.15167 )
								if( upperBB <= 269.273 )
									ret := 0.250000
								if( upperBB > 269.273 )
									ret := -1.000000 // sell
							if( priceRange > 6.15167 )
								if( avgHighLow <= 253.661 )
									ret := -0.864865 // sell
								if( avgHighLow > 253.661 )
									ret := -0.323529
						if( lowerBB > 283.533 )
							ret := 0.600000
					if( priceRange > 16.1979 )
						if( upperBB <= 292.458 )
							ret := 1.000000 // buy
						if( upperBB > 292.458 )
							ret := -0.250000
			if( ma > 308.795 )
				if( lowerBB <= 561.914 )
					if( upperKC <= 586.217 )
						if( rangema <= 17.7492 )
							if( dev <= 31.3933 )
								if( priceRange <= 18.6781 )
									ret := 0.251403
								if( priceRange > 18.6781 )
									ret := -0.320755
							if( dev > 31.3933 )
								if( val <= -1.34317 )
									ret := -0.072165
								if( val > -1.34317 )
									ret := -0.794872 // sell
						if( rangema > 17.7492 )
							if( upperKC <= 548.268 )
								ret := 1.000000 // buy
							if( upperKC > 548.268 )
								ret := 0.750000 // buy
					if( upperKC > 586.217 )
						if( lowerKC <= 545.001 )
							if( lowerBB <= 541.194 )
								ret := -0.250000
							if( lowerBB > 541.194 )
								ret := -1.000000 // sell
						if( lowerKC > 545.001 )
							if( val <= -2.38902 )
								if( lowerKC <= 546.851 )
									ret := 0.888889 // buy
								if( lowerKC > 546.851 )
									ret := 0.000000
							if( val > -2.38902 )
								if( lowerBB <= 530.674 )
									ret := 0.000000
								if( lowerBB > 530.674 )
									ret := 0.864198 // buy
				if( lowerBB > 561.914 )
					if( lowerKC <= 571.377 )
						if( ma <= 572.905 )
							if( rangema <= 3.3375 )
								if( rangema <= 2.9125 )
									ret := 0.250000
								if( rangema > 2.9125 )
									ret := 1.000000 // buy
							if( rangema > 3.3375 )
								ret := 0.000000
						if( ma > 572.905 )
							if( priceRange <= 14.967 )
								if( upperBB <= 587.249 )
									ret := -0.903226 // sell
								if( upperBB > 587.249 )
									ret := -0.448980
							if( priceRange > 14.967 )
								if( lowerBB <= 566.108 )
									ret := 1.000000 // buy
								if( lowerBB > 566.108 )
									ret := 0.000000
					if( lowerKC > 571.377 )
						if( sqzOffInt <= 0.5 )
							if( rangema <= 11.8578 )
								if( rangema <= 2.89917 )
									ret := -0.200000
								if( rangema > 2.89917 )
									ret := 0.769912 // buy
							if( rangema > 11.8578 )
								ret := -0.714286 // sell
						if( sqzOffInt > 0.5 )
							if( dev <= 18.5138 )
								if( rangema <= 8.1652 )
									ret := -0.369565
								if( rangema > 8.1652 )
									ret := 0.916667 // buy
							if( dev > 18.5138 )
								if( rangema <= 13.8552 )
									ret := -0.903226 // sell
								if( rangema > 13.8552 )
									ret := 0.500000
		if( val > -0.647802 )
			if( lowerBB <= 206.209 )
				if( dev <= 1.75983 )
					if( val <= 0.054674 )
						if( rangema <= 0.502255 )
							if( lowerBB <= 32.7082 )
								if( ma <= 23.0411 )
									ret := -0.185185
								if( ma > 23.0411 )
									ret := 0.118101
							if( lowerBB > 32.7082 )
								if( dev <= 0.338686 )
									ret := 0.635556
								if( dev > 0.338686 )
									ret := 0.218148
						if( rangema > 0.502255 )
							if( avgHighLow <= 27.7587 )
								if( val <= 0.026085 )
									ret := 0.706667 // buy
								if( val > 0.026085 )
									ret := 0.068966
							if( avgHighLow > 27.7587 )
								if( val <= -0.04071 )
									ret := 0.098007
								if( val > -0.04071 )
									ret := -0.154146
					if( val > 0.054674 )
						if( dev <= 0.476733 )
							if( rangema <= 0.406686 )
								if( upperKC <= 41.3729 )
									ret := -0.200000
								if( upperKC > 41.3729 )
									ret := 0.692308
							if( rangema > 0.406686 )
								if( val <= 0.058002 )
									ret := 0.000000
								if( val > 0.058002 )
									ret := 0.818182 // buy
						if( dev > 0.476733 )
							if( avgHighLow <= 23.2688 )
								if( dev <= 0.931022 )
									ret := -0.966667 // sell
								if( dev > 0.931022 )
									ret := -0.444444
							if( avgHighLow > 23.2688 )
								if( lowerBB <= 22.9047 )
									ret := 0.888889 // buy
								if( lowerBB > 22.9047 )
									ret := -0.113350
				if( dev > 1.75983 )
					if( val <= 0.070513 )
						if( val <= -0.274233 )
							if( lowerKC <= 124.549 )
								if( basis <= 129.18 )
									ret := 0.846154 // buy
								if( basis > 129.18 )
									ret := -0.500000
							if( lowerKC > 124.549 )
								if( upperBB <= 199.362 )
									ret := 0.942029 // buy
								if( upperBB > 199.362 )
									ret := 0.711864 // buy
						if( val > -0.274233 )
							if( upperKC <= 129.106 )
								if( upperKC <= 79.6258 )
									ret := 0.522822
								if( upperKC > 79.6258 )
									ret := 0.945055 // buy
							if( upperKC > 129.106 )
								if( val <= 0.049737 )
									ret := 0.204225
								if( val > 0.049737 )
									ret := -0.647059
					if( val > 0.070513 )
						if( dev <= 2.73178 )
							if( priceRange <= 4.56839 )
								if( rangema <= 1.30652 )
									ret := 0.357143
								if( rangema > 1.30652 )
									ret := 0.750000 // buy
							if( priceRange > 4.56839 )
								ret := -0.500000
						if( dev > 2.73178 )
							if( upperKC <= 209.052 )
								if( dev <= 7.61784 )
									ret := -0.341667
								if( dev > 7.61784 )
									ret := 0.218045
							if( upperKC > 209.052 )
								if( upperKC <= 215.987 )
									ret := 0.652893
								if( upperKC > 215.987 )
									ret := -0.083333
			if( lowerBB > 206.209 )
				if( priceRange <= 9.51333 )
					if( dev <= 1.11777 )
						if( val <= 0.098213 )
							if( rangema <= 0.628053 )
								if( ma <= 321.827 )
									ret := 0.024519
								if( ma > 321.827 )
									ret := 0.700000 // buy
							if( rangema > 0.628053 )
								if( lowerKC <= 223.966 )
									ret := -0.150685
								if( lowerKC > 223.966 )
									ret := -0.025008
						if( val > 0.098213 )
							if( rangema <= 1.51071 )
								if( upperKC <= 217.588 )
									ret := 0.092308
								if( upperKC > 217.588 )
									ret := -0.185022
							if( rangema > 1.51071 )
								if( val <= 0.207501 )
									ret := -0.866667 // sell
								if( val > 0.207501 )
									ret := 0.000000
					if( dev > 1.11777 )
						if( rangema <= 5.92504 )
							if( dev <= 4.06172 )
								if( rangema <= 4.6625 )
									ret := 0.026519
								if( rangema > 4.6625 )
									ret := 0.697674
							if( dev > 4.06172 )
								if( lowerBB <= 571.618 )
									ret := 0.080653
								if( lowerBB > 571.618 )
									ret := -0.095238
						if( rangema > 5.92504 )
							if( upperKC <= 234.289 )
								if( upperBB <= 230.641 )
									ret := -0.500000
								if( upperBB > 230.641 )
									ret := -1.000000 // sell
							if( upperKC > 234.289 )
								if( lowerBB <= 216.453 )
									ret := 0.766667 // buy
								if( lowerBB > 216.453 )
									ret := -0.047277
				if( priceRange > 9.51333 )
					if( rangema <= 30.1275 )
						if( upperBB <= 602.095 )
							if( upperBB <= 427.344 )
								if( lowerKC <= 227.325 )
									ret := 0.690141
								if( lowerKC > 227.325 )
									ret := 0.031795
							if( upperBB > 427.344 )
								if( upperKC <= 456.974 )
									ret := 0.836957 // buy
								if( upperKC > 456.974 )
									ret := 0.222543
						if( upperBB > 602.095 )
							if( avgHighLow <= 588.856 )
								if( rangema <= 16.9373 )
									ret := -0.837209 // sell
								if( rangema > 16.9373 )
									ret := 0.285714
							if( avgHighLow > 588.856 )
								if( upperBB <= 606.471 )
									ret := -0.625000
								if( upperBB > 606.471 )
									ret := 0.555556
					if( rangema > 30.1275 )
						if( lowerKC <= 325.064 )
							ret := -0.500000
						if( lowerKC > 325.064 )
							ret := -1.000000 // sell
	if( lowerKC > 582.103 )
		if( dev <= 20.2434 )
			if( avgHighLow <= 598.336 )
				if( ma <= 595.736 )
					if( upperKC <= 602.182 )
						if( priceRange <= 6.95526 )
							if( rangema <= 3.35262 )
								if( avgHighLow <= 595.872 )
									ret := -0.044796
								if( avgHighLow > 595.872 )
									ret := -0.571429
							if( rangema > 3.35262 )
								if( lowerBB <= 587.653 )
									ret := -0.245421
								if( lowerBB > 587.653 )
									ret := -0.714286 // sell
						if( priceRange > 6.95526 )
							if( val <= -0.186431 )
								if( upperKC <= 600.977 )
									ret := -0.545455
								if( upperKC > 600.977 )
									ret := 0.500000
							if( val > -0.186431 )
								if( lowerBB <= 585.523 )
									ret := -0.333333
								if( lowerBB > 585.523 )
									ret := 0.781250 // buy
					if( upperKC > 602.182 )
						if( sqzOnInt <= 0.5 )
							if( val <= 0.11586 )
								if( val <= -0.325312 )
									ret := 0.777778 // buy
								if( val > -0.325312 )
									ret := -0.142857
							if( val > 0.11586 )
								if( val <= 0.835912 )
									ret := 1.000000 // buy
								if( val > 0.835912 )
									ret := 0.500000
						if( sqzOnInt > 0.5 )
							ret := -0.428571
				if( ma > 595.736 )
					if( lowerBB <= 583.377 )
						if( upperKC <= 609.921 )
							if( basis <= 596.93 )
								if( priceRange <= 5.83445 )
									ret := 1.000000 // buy
								if( priceRange > 5.83445 )
									ret := 0.000000
							if( basis > 596.93 )
								if( lowerKC <= 589.746 )
									ret := -1.000000 // sell
								if( lowerKC > 589.746 )
									ret := -0.250000
						if( upperKC > 609.921 )
							if( priceRange <= 6.92007 )
								ret := 0.714286 // buy
							if( priceRange > 6.92007 )
								ret := 1.000000 // buy
					if( lowerBB > 583.377 )
						if( rangema <= 6.67216 )
							if( rangema <= 5.05448 )
								if( lowerKC <= 590.839 )
									ret := -0.712644 // sell
								if( lowerKC > 590.839 )
									ret := -0.307116
							if( rangema > 5.05448 )
								if( upperBB <= 609.516 )
									ret := -0.200000
								if( upperBB > 609.516 )
									ret := 0.916667 // buy
						if( rangema > 6.67216 )
							if( val <= -0.718357 )
								ret := 0.000000
							if( val > -0.718357 )
								if( dev <= 17.318 )
									ret := -0.945205 // sell
								if( dev > 17.318 )
									ret := -0.533333
			if( avgHighLow > 598.336 )
				if( val <= 0.447752 )
					if( lowerKC <= 602.265 )
						if( ma <= 610.188 )
							if( rangema <= 6.46112 )
								if( avgHighLow <= 598.586 )
									ret := 0.750000 // buy
								if( avgHighLow > 598.586 )
									ret := 0.025000
							if( rangema > 6.46112 )
								if( basis <= 604.22 )
									ret := -0.100000
								if( basis > 604.22 )
									ret := -0.718310 // sell
						if( ma > 610.188 )
							if( upperBB <= 619.091 )
								if( lowerBB <= 603.246 )
									ret := 1.000000 // buy
								if( lowerBB > 603.246 )
									ret := 0.750000 // buy
							if( upperBB > 619.091 )
								if( sqzOnInt <= 0.5 )
									ret := 0.857143 // buy
								if( sqzOnInt > 0.5 )
									ret := 0.125000
					if( lowerKC > 602.265 )
						if( avgHighLow <= 614.705 )
							if( avgHighLow <= 608.675 )
								if( basis <= 610.039 )
									ret := -0.117647
								if( basis > 610.039 )
									ret := 0.818182 // buy
							if( avgHighLow > 608.675 )
								if( lowerBB <= 604.962 )
									ret := -0.715152 // sell
								if( lowerBB > 604.962 )
									ret := -0.298343
						if( avgHighLow > 614.705 )
							if( upperBB <= 637.703 )
								if( upperKC <= 631.505 )
									ret := -0.166667
								if( upperKC > 631.505 )
									ret := 0.405405
							if( upperBB > 637.703 )
								if( val <= -1.04393 )
									ret := 0.141176
								if( val > -1.04393 )
									ret := -0.204689
				if( val > 0.447752 )
					if( lowerKC <= 636.019 )
						if( basis <= 612.327 )
							if( dev <= 17.0799 )
								if( dev <= 7.44476 )
									ret := -0.175676
								if( dev > 7.44476 )
									ret := 0.264706
							if( dev > 17.0799 )
								if( dev <= 18.5412 )
									ret := -0.500000
								if( dev > 18.5412 )
									ret := -1.000000 // sell
						if( basis > 612.327 )
							if( rangema <= 3.55 )
								if( dev <= 5.47399 )
									ret := 0.000000
								if( dev > 5.47399 )
									ret := -0.625000
							if( rangema > 3.55 )
								if( avgHighLow <= 614.45 )
									ret := 0.803922 // buy
								if( avgHighLow > 614.45 )
									ret := 0.450172
					if( lowerKC > 636.019 )
						if( avgHighLow <= 648.581 )
							if( avgHighLow <= 644.356 )
								ret := -0.400000
							if( avgHighLow > 644.356 )
								if( basis <= 646.821 )
									ret := -0.904762 // sell
								if( basis > 646.821 )
									ret := -1.000000 // sell
						if( avgHighLow > 648.581 )
							if( val <= 0.502009 )
								if( upperBB <= 686.677 )
									ret := 0.000000
								if( upperBB > 686.677 )
									ret := -0.888889 // sell
							if( val > 0.502009 )
								if( lowerBB <= 637.032 )
									ret := 0.454545
								if( lowerBB > 637.032 )
									ret := 0.000000
		if( dev > 20.2434 )
			if( upperBB <= 630.225 )
				if( priceRange <= 7.95 )
					ret := 0.000000
				if( priceRange > 7.95 )
					if( val <= -0.971865 )
						ret := -0.500000
					if( val > -0.971865 )
						ret := -1.000000 // sell
			if( upperBB > 630.225 )
				if( val <= 1.22643 )
					if( ma <= 637.513 )
						if( upperBB <= 654.476 )
							if( upperBB <= 631.582 )
								ret := 0.333333
							if( upperBB > 631.582 )
								if( lowerBB <= 599.098 )
									ret := 0.897436 // buy
								if( lowerBB > 599.098 )
									ret := 0.250000
						if( upperBB > 654.476 )
							if( upperBB <= 658.199 )
								if( priceRange <= 9.68468 )
									ret := 0.333333
								if( priceRange > 9.68468 )
									ret := -0.600000
							if( upperBB > 658.199 )
								if( basis <= 635.59 )
									ret := 0.875000 // buy
								if( basis > 635.59 )
									ret := -0.333333
					if( ma > 637.513 )
						if( lowerKC <= 627.828 )
							ret := 1.000000 // buy
						if( lowerKC > 627.828 )
							if( val <= 0.242577 )
								if( ma <= 640.605 )
									ret := 0.500000
								if( ma > 640.605 )
									ret := 0.920000 // buy
							if( val > 0.242577 )
								if( basis <= 650.922 )
									ret := -0.250000
								if( basis > 650.922 )
									ret := 0.000000
				if( val > 1.22643 )
					if( ma <= 618.839 )
						ret := -1.000000 // sell
					if( ma > 618.839 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_92c23511(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


