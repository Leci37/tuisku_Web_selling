//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: NVDA_30Min_1SQU_0c8ea0ce Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1SQU_0c8ea0ce", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_0c8ea0ce(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma <= 151.378 )
		if( upperBB <= 151.871 )
			if( val <= -0.271206 )
				if( avgHighLow <= 141.765 )
					if( rangema <= 2.19456 )
						if( lowerKC <= 118.454 )
							if( upperBB <= 109.93 )
								if( dev <= 4.09405 )
									ret := -0.400000
								if( dev > 4.09405 )
									ret := 0.636364
							if( upperBB > 109.93 )
								if( dev <= 4.23771 )
									ret := -0.569231
								if( dev > 4.23771 )
									ret := -0.956522 // sell
						if( lowerKC > 118.454 )
							if( priceRange <= 0.8155 )
								if( rangema <= 1.71784 )
									ret := 0.255319
								if( rangema > 1.71784 )
									ret := -0.437500
							if( priceRange > 0.8155 )
								if( ma <= 127.729 )
									ret := 0.200000
								if( ma > 127.729 )
									ret := -0.666667
					if( rangema > 2.19456 )
						if( val <= -0.435461 )
							if( ma <= 107.98 )
								ret := 1.000000 // buy
							if( ma > 107.98 )
								ret := 0.750000 // buy
						if( val > -0.435461 )
							if( lowerKC <= 109.682 )
								ret := -1.000000 // sell
							if( lowerKC > 109.682 )
								ret := 0.000000
				if( avgHighLow > 141.765 )
					if( lowerKC <= 143.785 )
						if( ma <= 144.244 )
							ret := 0.000000
						if( ma > 144.244 )
							if( priceRange <= 1.42591 )
								ret := 0.000000
							if( priceRange > 1.42591 )
								ret := 0.500000
					if( lowerKC > 143.785 )
						if( ma <= 146.576 )
							if( basis <= 146.303 )
								ret := 0.666667
							if( basis > 146.303 )
								ret := 1.000000 // buy
						if( ma > 146.576 )
							if( priceRange <= 0.94495 )
								ret := 0.000000
							if( priceRange > 0.94495 )
								ret := 0.500000
			if( val > -0.271206 )
				if( ma <= 149.596 )
					if( lowerKC <= 148.413 )
						if( rangema <= 2.9749 )
							if( val <= -0.011115 )
								if( rangema <= 2.15477 )
									ret := 0.038492
								if( rangema > 2.15477 )
									ret := 0.704918 // buy
							if( val > -0.011115 )
								if( avgHighLow <= 25.5041 )
									ret := 0.756098 // buy
								if( avgHighLow > 25.5041 )
									ret := 0.120389
						if( rangema > 2.9749 )
							if( avgHighLow <= 114.832 )
								if( lowerBB <= 93.2262 )
									ret := 0.000000
								if( lowerBB > 93.2262 )
									ret := 0.925926 // buy
							if( avgHighLow > 114.832 )
								if( dev <= 3.69638 )
									ret := -1.000000 // sell
								if( dev > 3.69638 )
									ret := -0.200000
					if( lowerKC > 148.413 )
						if( upperKC <= 150.295 )
							if( val <= 0.034485 )
								if( rangema <= 0.532518 )
									ret := 1.000000 // buy
								if( rangema > 0.532518 )
									ret := 0.777778 // buy
							if( val > 0.034485 )
								if( avgHighLow <= 149.631 )
									ret := 0.000000
								if( avgHighLow > 149.631 )
									ret := 1.000000 // buy
						if( upperKC > 150.295 )
							ret := -0.400000
				if( ma > 149.596 )
					if( val <= 0.109707 )
						if( priceRange <= 1.66125 )
							if( priceRange <= 1.19907 )
								if( upperKC <= 152.219 )
									ret := -0.276786
								if( upperKC > 152.219 )
									ret := 1.000000 // buy
							if( priceRange > 1.19907 )
								if( rangema <= 1.22119 )
									ret := 0.850000 // buy
								if( rangema > 1.22119 )
									ret := -0.666667
						if( priceRange > 1.66125 )
							if( lowerBB <= 147.993 )
								if( avgHighLow <= 149.557 )
									ret := -0.833333 // sell
								if( avgHighLow > 149.557 )
									ret := 0.500000
							if( lowerBB > 147.993 )
								if( lowerBB <= 148.772 )
									ret := -0.933333 // sell
								if( lowerBB > 148.772 )
									ret := -0.400000
					if( val > 0.109707 )
						if( lowerBB <= 149.558 )
							ret := -1.000000 // sell
						if( lowerBB > 149.558 )
							ret := -0.250000
		if( upperBB > 151.871 )
			if( avgHighLow <= 147.405 )
				if( priceRange <= 2.3193 )
					if( rangema <= 1.63421 )
						ret := 0.428571
					if( rangema > 1.63421 )
						if( lowerBB <= 129.552 )
							ret := 0.250000
						if( lowerBB > 129.552 )
							if( avgHighLow <= 146.21 )
								if( rangema <= 3.1782 )
									ret := 1.000000 // buy
								if( rangema > 3.1782 )
									ret := 0.500000
							if( avgHighLow > 146.21 )
								if( val <= 0.307791 )
									ret := 1.000000 // buy
								if( val > 0.307791 )
									ret := 0.333333
				if( priceRange > 2.3193 )
					ret := 0.000000
			if( avgHighLow > 147.405 )
				if( upperBB <= 153.572 )
					if( priceRange <= 2.08821 )
						if( avgHighLow <= 149.148 )
							if( basis <= 150.306 )
								if( rangema <= 1.00939 )
									ret := -1.000000 // sell
								if( rangema > 1.00939 )
									ret := -0.222222
							if( basis > 150.306 )
								if( val <= 0.174353 )
									ret := 0.500000
								if( val > 0.174353 )
									ret := 1.000000 // buy
						if( avgHighLow > 149.148 )
							if( val <= 0.011083 )
								if( val <= -0.133882 )
									ret := 0.081081
								if( val > -0.133882 )
									ret := 0.776000 // buy
							if( val > 0.011083 )
								if( priceRange <= 1.07455 )
									ret := 0.434783
								if( priceRange > 1.07455 )
									ret := -0.195122
					if( priceRange > 2.08821 )
						if( upperKC <= 152.574 )
							if( rangema <= 0.879188 )
								ret := 0.500000
							if( rangema > 0.879188 )
								if( lowerKC <= 147.26 )
									ret := 0.800000 // buy
								if( lowerKC > 147.26 )
									ret := 1.000000 // buy
						if( upperKC > 152.574 )
							ret := 0.250000
				if( upperBB > 153.572 )
					if( dev <= 4.68421 )
						if( lowerBB <= 147.476 )
							if( avgHighLow <= 150.825 )
								if( ma <= 150.256 )
									ret := 0.600000
								if( ma > 150.256 )
									ret := -0.222222
							if( avgHighLow > 150.825 )
								if( upperBB <= 154.781 )
									ret := 0.333333
								if( upperBB > 154.781 )
									ret := 0.888889 // buy
						if( lowerBB > 147.476 )
							if( avgHighLow <= 150.831 )
								if( priceRange <= 0.911744 )
									ret := 0.000000
								if( priceRange > 0.911744 )
									ret := -0.869565 // sell
							if( avgHighLow > 150.831 )
								if( lowerKC <= 150.023 )
									ret := -0.400000
								if( lowerKC > 150.023 )
									ret := 0.750000 // buy
					if( dev > 4.68421 )
						if( avgHighLow <= 149.614 )
							if( upperBB <= 155.073 )
								ret := -0.500000
							if( upperBB > 155.073 )
								ret := -1.000000 // sell
						if( avgHighLow > 149.614 )
							if( rangema <= 2.0662 )
								if( upperKC <= 153.763 )
									ret := 0.000000
								if( upperKC > 153.763 )
									ret := -0.500000
							if( rangema > 2.0662 )
								if( avgHighLow <= 153.146 )
									ret := -1.000000 // sell
								if( avgHighLow > 153.146 )
									ret := -0.250000
	if( ma > 151.378 )
		if( dev <= 4.40929 )
			if( val <= 0.185808 )
				if( rangema <= 1.4721 )
					if( basis <= 152.207 )
						if( avgHighLow <= 151.903 )
							if( val <= -0.131956 )
								if( avgHighLow <= 151.468 )
									ret := -0.947368 // sell
								if( avgHighLow > 151.468 )
									ret := -0.181818
							if( val > -0.131956 )
								if( priceRange <= 0.455271 )
									ret := -0.437500
								if( priceRange > 0.455271 )
									ret := 0.164286
						if( avgHighLow > 151.903 )
							if( lowerBB <= 150.965 )
								if( priceRange <= 1.79635 )
									ret := -0.863014 // sell
								if( priceRange > 1.79635 )
									ret := 0.000000
							if( lowerBB > 150.965 )
								if( val <= 0.021763 )
									ret := 0.250000
								if( val > 0.021763 )
									ret := -0.600000
					if( basis > 152.207 )
						if( upperBB <= 165.92 )
							if( dev <= 0.611794 )
								if( val <= 0.070637 )
									ret := 0.497608
								if( val > 0.070637 )
									ret := -0.677419
							if( dev > 0.611794 )
								if( val <= -0.120472 )
									ret := -0.113106
								if( val > -0.120472 )
									ret := 0.108494
						if( upperBB > 165.92 )
							if( dev <= 2.00643 )
								if( upperBB <= 230.133 )
									ret := -0.054961
								if( upperBB > 230.133 )
									ret := 0.028098
							if( dev > 2.00643 )
								if( ma <= 245.139 )
									ret := 0.145817
								if( ma > 245.139 )
									ret := -0.023856
				if( rangema > 1.4721 )
					if( dev <= 2.90971 )
						if( ma <= 461.111 )
							if( basis <= 230.71 )
								if( val <= -0.073166 )
									ret := 0.206202
								if( val > -0.073166 )
									ret := -0.038877
							if( basis > 230.71 )
								if( avgHighLow <= 244.494 )
									ret := -0.431429
								if( avgHighLow > 244.494 )
									ret := -0.057965
						if( ma > 461.111 )
							if( upperBB <= 467.773 )
								if( dev <= 2.49306 )
									ret := 1.000000 // buy
								if( dev > 2.49306 )
									ret := 0.500000
							if( upperBB > 467.773 )
								if( lowerBB <= 463.059 )
									ret := -1.000000 // sell
								if( lowerBB > 463.059 )
									ret := 0.161790
					if( dev > 2.90971 )
						if( priceRange <= 1.97799 )
							if( lowerBB <= 221.747 )
								if( rangema <= 1.99922 )
									ret := -0.005181
								if( rangema > 1.99922 )
									ret := 0.345515
							if( lowerBB > 221.747 )
								if( rangema <= 2.15353 )
									ret := -0.200795
								if( rangema > 2.15353 )
									ret := 0.007109
						if( priceRange > 1.97799 )
							if( basis <= 236.965 )
								if( lowerBB <= 227.736 )
									ret := -0.236629
								if( lowerBB > 227.736 )
									ret := -0.620690
							if( basis > 236.965 )
								if( basis <= 255.076 )
									ret := 0.272031
								if( basis > 255.076 )
									ret := -0.123071
			if( val > 0.185808 )
				if( upperKC <= 527.866 )
					if( upperBB <= 163.494 )
						if( upperKC <= 158.003 )
							if( upperKC <= 157.154 )
								if( lowerBB <= 151.889 )
									ret := 0.114943
								if( lowerBB > 151.889 )
									ret := -0.695652
							if( upperKC > 157.154 )
								if( ma <= 156.489 )
									ret := 0.675676
								if( ma > 156.489 )
									ret := -0.200000
						if( upperKC > 158.003 )
							if( upperKC <= 164.942 )
								if( lowerBB <= 157.716 )
									ret := -0.240310
								if( lowerBB > 157.716 )
									ret := -0.678161
							if( upperKC > 164.942 )
								ret := 1.000000 // buy
					if( upperBB > 163.494 )
						if( lowerKC <= 214.82 )
							if( lowerKC <= 211.011 )
								if( basis <= 213.248 )
									ret := 0.205818
								if( basis > 213.248 )
									ret := -0.928571 // sell
							if( lowerKC > 211.011 )
								if( dev <= 1.77718 )
									ret := -0.750000 // sell
								if( dev > 1.77718 )
									ret := 0.763780 // buy
						if( lowerKC > 214.82 )
							if( upperKC <= 262.553 )
								if( lowerBB <= 250.653 )
									ret := -0.003729
								if( lowerBB > 250.653 )
									ret := -0.511628
							if( upperKC > 262.553 )
								if( basis <= 262.899 )
									ret := 0.739726 // buy
								if( basis > 262.899 )
									ret := 0.122112
				if( upperKC > 527.866 )
					if( rangema <= 1.05834 )
						ret := 1.000000 // buy
					if( rangema > 1.05834 )
						if( avgHighLow <= 769.52 )
							if( avgHighLow <= 531.892 )
								if( val <= 0.433758 )
									ret := -0.607143
								if( val > 0.433758 )
									ret := 0.333333
							if( avgHighLow > 531.892 )
								if( dev <= 2.89843 )
									ret := 0.186667
								if( dev > 2.89843 )
									ret := -0.142857
						if( avgHighLow > 769.52 )
							if( upperKC <= 798.74 )
								if( upperBB <= 794.671 )
									ret := -0.571429
								if( upperBB > 794.671 )
									ret := -0.956522 // sell
							if( upperKC > 798.74 )
								if( val <= 0.684623 )
									ret := -0.283333
								if( val > 0.684623 )
									ret := 0.333333
		if( dev > 4.40929 )
			if( lowerBB <= 189.84 )
				if( rangema <= 2.85484 )
					if( dev <= 5.07514 )
						if( priceRange <= 2.61211 )
							if( avgHighLow <= 161.59 )
								if( rangema <= 1.12062 )
									ret := -0.750000 // sell
								if( rangema > 1.12062 )
									ret := 0.837500 // buy
							if( avgHighLow > 161.59 )
								if( ma <= 163.792 )
									ret := -0.558140
								if( ma > 163.792 )
									ret := 0.214286
						if( priceRange > 2.61211 )
							if( lowerBB <= 168.598 )
								if( rangema <= 2.31113 )
									ret := -0.758621 // sell
								if( rangema > 2.31113 )
									ret := -0.200000
							if( lowerBB > 168.598 )
								if( dev <= 4.5916 )
									ret := -0.750000 // sell
								if( dev > 4.5916 )
									ret := 0.400000
					if( dev > 5.07514 )
						if( dev <= 6.57958 )
							if( priceRange <= 1.57795 )
								if( val <= 0.242069 )
									ret := -0.314607
								if( val > 0.242069 )
									ret := 0.114286
							if( priceRange > 1.57795 )
								if( basis <= 195.633 )
									ret := -0.681452
								if( basis > 195.633 )
									ret := 0.833333 // buy
						if( dev > 6.57958 )
							if( ma <= 158.601 )
								if( priceRange <= 6.55754 )
									ret := -0.730159 // sell
								if( priceRange > 6.55754 )
									ret := 1.000000 // buy
							if( ma > 158.601 )
								if( lowerKC <= 190.472 )
									ret := 0.158416
								if( lowerKC > 190.472 )
									ret := -0.545455
				if( rangema > 2.85484 )
					if( dev <= 9.26722 )
						if( priceRange <= 1.20145 )
							if( dev <= 7.38233 )
								if( dev <= 4.72663 )
									ret := -0.750000 // sell
								if( dev > 4.72663 )
									ret := 0.200000
							if( dev > 7.38233 )
								if( rangema <= 3.30368 )
									ret := 0.750000 // buy
								if( rangema > 3.30368 )
									ret := 1.000000 // buy
						if( priceRange > 1.20145 )
							if( val <= -0.4422 )
								if( avgHighLow <= 163.315 )
									ret := 1.000000 // buy
								if( avgHighLow > 163.315 )
									ret := -0.571429
							if( val > -0.4422 )
								if( dev <= 5.24563 )
									ret := 0.700000 // buy
								if( dev > 5.24563 )
									ret := 0.939759 // buy
					if( dev > 9.26722 )
						if( priceRange <= 8.17525 )
							if( upperBB <= 208.762 )
								if( avgHighLow <= 189.67 )
									ret := -0.156863
								if( avgHighLow > 189.67 )
									ret := 0.666667
							if( upperBB > 208.762 )
								if( lowerBB <= 86.5404 )
									ret := 0.000000
								if( lowerBB > 86.5404 )
									ret := -0.774194 // sell
						if( priceRange > 8.17525 )
							if( basis <= 197.977 )
								ret := -0.750000 // sell
							if( basis > 197.977 )
								ret := -1.000000 // sell
			if( lowerBB > 189.84 )
				if( rangema <= 7.58098 )
					if( basis <= 198.75 )
						if( lowerBB <= 193.14 )
							if( rangema <= 2.89899 )
								if( upperBB <= 204.383 )
									ret := 0.948276 // buy
								if( upperBB > 204.383 )
									ret := 0.615385
							if( rangema > 2.89899 )
								ret := 0.285714
						if( lowerBB > 193.14 )
							ret := 0.285714
					if( basis > 198.75 )
						if( dev <= 13.7736 )
							if( val <= -0.46084 )
								if( basis <= 245.418 )
									ret := -0.207349
								if( basis > 245.418 )
									ret := 0.056429
							if( val > -0.46084 )
								if( rangema <= 4.77215 )
									ret := 0.099088
								if( rangema > 4.77215 )
									ret := 0.197894
						if( dev > 13.7736 )
							if( upperKC <= 512.749 )
								if( val <= -0.501138 )
									ret := 0.725275 // buy
								if( val > -0.501138 )
									ret := 0.305556
							if( upperKC > 512.749 )
								if( lowerBB <= 1041.19 )
									ret := 0.079526
								if( lowerBB > 1041.19 )
									ret := 0.797297 // buy
				if( rangema > 7.58098 )
					if( upperBB <= 680.587 )
						if( ma <= 385.446 )
							if( priceRange <= 5.91 )
								ret := 1.000000 // buy
							if( priceRange > 5.91 )
								ret := -0.166667
						if( ma > 385.446 )
							if( val <= -0.739442 )
								if( priceRange <= 2.5247 )
									ret := -0.250000
								if( priceRange > 2.5247 )
									ret := -0.937500 // sell
							if( val > -0.739442 )
								if( lowerBB <= 482.872 )
									ret := -0.806452 // sell
								if( lowerBB > 482.872 )
									ret := 0.220000
					if( upperBB > 680.587 )
						if( lowerBB <= 784.499 )
							if( ma <= 765.793 )
								if( priceRange <= 8.08019 )
									ret := -0.166667
								if( priceRange > 8.08019 )
									ret := 0.500000
							if( ma > 765.793 )
								if( avgHighLow <= 778.867 )
									ret := 0.935484 // buy
								if( avgHighLow > 778.867 )
									ret := 0.485294
						if( lowerBB > 784.499 )
							if( dev <= 20.5215 )
								if( upperBB <= 1220.79 )
									ret := -0.211293
								if( upperBB > 1220.79 )
									ret := -1.000000 // sell
							if( dev > 20.5215 )
								if( val <= -1.705 )
									ret := -0.306667
								if( val > -1.705 )
									ret := 0.463576
	
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
float op_operation = decision_tree_0_NVDA_30Min_0c8ea0ce(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


