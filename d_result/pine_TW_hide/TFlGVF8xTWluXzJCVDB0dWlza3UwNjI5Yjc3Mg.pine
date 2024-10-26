//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: LYFT_1Min_2BT0_0629b772 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2BT0_0629b772", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_0629b772(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.014938 )
		if( ema3 <= 11.0657 )
			if( bearPower <= -0.000924 )
				if( bbm <= 0.00499 )
					if( ema2 <= 11.022 )
						if( ema1 <= 10.8741 )
							if( ema13 <= -0.01808 )
								if( bbp <= -0.040924 )
									ret := 0.527473
								if( bbp > -0.040924 )
									ret := -0.464286
							if( ema13 > -0.01808 )
								if( bullPower <= -0.007218 )
									ret := 0.636086
								if( bullPower > -0.007218 )
									ret := 0.301980
						if( ema1 > 10.8741 )
							if( ema1 <= 11.0043 )
								if( ema2 <= 10.9107 )
									ret := -0.181818
								if( ema2 > 10.9107 )
									ret := -0.631579
							if( ema1 > 11.0043 )
								ret := 0.750000 // buy
					if( ema2 > 11.022 )
						if( ema2 <= 11.0529 )
							ret := 1.000000 // buy
						if( ema2 > 11.0529 )
							if( ema1 <= 11.0594 )
								ret := 0.583333
							if( ema1 > 11.0594 )
								ret := 0.900000 // buy
				if( bbm > 0.00499 )
					if( ema3 <= 9.71116 )
						if( bearPower <= -0.152276 )
							if( ema12 <= -0.082399 )
								ret := 1.000000 // buy
							if( ema12 > -0.082399 )
								if( bullPower <= -0.020907 )
									ret := 0.833333 // buy
								if( bullPower > -0.020907 )
									ret := 0.916667 // buy
						if( bearPower > -0.152276 )
							if( tema <= 9.46739 )
								if( ema3 <= 9.44485 )
									ret := 0.299492
								if( ema3 > 9.44485 )
									ret := -0.622642
							if( tema > 9.46739 )
								if( ema13 <= 0.010129 )
									ret := 0.345550
								if( ema13 > 0.010129 )
									ret := 0.840000 // buy
					if( ema3 > 9.71116 )
						if( ema1 <= 10.1896 )
							if( ema1 <= 10.0362 )
								if( ema3 <= 9.78309 )
									ret := -0.046322
								if( ema3 > 9.78309 )
									ret := 0.218968
							if( ema1 > 10.0362 )
								if( bbp <= -0.039829 )
									ret := 0.208791
								if( bbp > -0.039829 )
									ret := -0.483607
						if( ema1 > 10.1896 )
							if( tema <= 10.1899 )
								if( ema13 <= -0.384644 )
									ret := 0.666667
								if( ema13 > -0.384644 )
									ret := 0.944444 // buy
							if( tema > 10.1899 )
								if( bearPower <= -0.120165 )
									ret := -0.368421
								if( bearPower > -0.120165 )
									ret := 0.206041
			if( bearPower > -0.000924 )
				if( bearPower <= 0.003954 )
					if( bearPower <= -0.000832 )
						ret := -0.600000
					if( bearPower > -0.000832 )
						if( ema12 <= 0.005227 )
							if( bbm <= 0.004754 )
								if( ema12 <= 0.000367 )
									ret := -0.070175
								if( ema12 > 0.000367 )
									ret := 0.579545
							if( bbm > 0.004754 )
								if( ema13 <= -0.007233 )
									ret := 0.818182 // buy
								if( ema13 > -0.007233 )
									ret := -0.081967
						if( ema12 > 0.005227 )
							if( ema3 <= 10.8098 )
								if( ema13 <= 0.020549 )
									ret := -0.442857
								if( ema13 > 0.020549 )
									ret := 0.333333
							if( ema3 > 10.8098 )
								ret := 0.600000
				if( bearPower > 0.003954 )
					if( ema3 <= 10.4643 )
						if( ema3 <= 9.76001 )
							if( ema13 <= 0.00717 )
								if( tema <= 9.10333 )
									ret := 0.176471
								if( tema > 9.10333 )
									ret := -0.458333
							if( ema13 > 0.00717 )
								ret := 0.500000
						if( ema3 > 9.76001 )
							if( bullPower <= 0.00567 )
								ret := -0.200000
							if( bullPower > 0.00567 )
								if( ema2 <= 9.89646 )
									ret := -1.000000 // sell
								if( ema2 > 9.89646 )
									ret := -0.645161
					if( ema3 > 10.4643 )
						if( ema3 <= 10.7964 )
							ret := 0.769231 // buy
						if( ema3 > 10.7964 )
							if( ema12 <= 0.001281 )
								ret := -0.214286
							if( ema12 > 0.001281 )
								ret := -0.153846
		if( ema3 > 11.0657 )
			if( tema <= 15.7338 )
				if( bbm <= 0.0049 )
					if( bbp <= -0.019505 )
						if( ema2 <= 13.5918 )
							if( ema13 <= -0.087781 )
								ret := -0.428571
							if( ema13 > -0.087781 )
								if( ema2 <= 12.5089 )
									ret := 0.619143
								if( ema2 > 12.5089 )
									ret := 0.514523
						if( ema2 > 13.5918 )
							if( bearPower <= -0.05013 )
								if( bbp <= -0.121289 )
									ret := 0.466667
								if( bbp > -0.121289 )
									ret := -0.647059
							if( bearPower > -0.05013 )
								if( ema2 <= 13.6187 )
									ret := -0.967742 // sell
								if( ema2 > 13.6187 )
									ret := 0.606322
					if( bbp > -0.019505 )
						if( bullPower <= -0.003529 )
							if( ema12 <= -0.011679 )
								if( ema3 <= 12.4912 )
									ret := -0.833333 // sell
								if( ema3 > 12.4912 )
									ret := 0.000000
							if( ema12 > -0.011679 )
								if( ema2 <= 12.4881 )
									ret := 0.469438
								if( ema2 > 12.4881 )
									ret := 0.150391
						if( bullPower > -0.003529 )
							if( ema3 <= 15.6583 )
								if( ema12 <= -0.010381 )
									ret := -0.714286 // sell
								if( ema12 > -0.010381 )
									ret := -0.007312
							if( ema3 > 15.6583 )
								if( ema3 <= 15.6746 )
									ret := 0.923077 // buy
								if( ema3 > 15.6746 )
									ret := 0.111111
				if( bbm > 0.0049 )
					if( ema3 <= 15.7651 )
						if( tema <= 15.3498 )
							if( ema1 <= 13.452 )
								if( ema2 <= 12.0696 )
									ret := -0.012731
								if( ema2 > 12.0696 )
									ret := 0.062834
							if( ema1 > 13.452 )
								if( bbp <= -0.103159 )
									ret := -0.334052
								if( bbp > -0.103159 )
									ret := -0.047888
						if( tema > 15.3498 )
							if( ema2 <= 15.7278 )
								if( ema2 <= 15.7011 )
									ret := 0.128964
								if( ema2 > 15.7011 )
									ret := 0.530769
							if( ema2 > 15.7278 )
								if( bbp <= -0.112992 )
									ret := 0.428571
								if( bbp > -0.112992 )
									ret := -0.405714
					if( ema3 > 15.7651 )
						if( bbp <= -0.103385 )
							if( bearPower <= -0.082572 )
								if( bullPower <= -0.075802 )
									ret := 0.812500 // buy
								if( bullPower > -0.075802 )
									ret := 0.987654 // buy
							if( bearPower > -0.082572 )
								if( bbm <= 0.018214 )
									ret := 1.000000 // buy
								if( bbm > 0.018214 )
									ret := 0.590909
						if( bbp > -0.103385 )
							if( tema <= 15.6922 )
								ret := -0.700000 // sell
							if( tema > 15.6922 )
								if( bbm <= 0.02013 )
									ret := 0.037736
								if( bbm > 0.02013 )
									ret := 0.881579 // buy
			if( tema > 15.7338 )
				if( bbm <= 0.003523 )
					if( bearPower <= -0.014291 )
						if( ema3 <= 16.705 )
							if( tema <= 16.6014 )
								if( ema2 <= 15.879 )
									ret := 0.771429 // buy
								if( ema2 > 15.879 )
									ret := 0.394464
							if( tema > 16.6014 )
								if( bbp <= -0.055831 )
									ret := -1.000000 // sell
								if( bbp > -0.055831 )
									ret := -0.062500
						if( ema3 > 16.705 )
							if( bullPower <= -0.027392 )
								if( ema1 <= 17.5041 )
									ret := 0.881944 // buy
								if( ema1 > 17.5041 )
									ret := 0.603175
							if( bullPower > -0.027392 )
								if( ema12 <= -0.023626 )
									ret := -0.800000 // sell
								if( ema12 > -0.023626 )
									ret := 0.484615
					if( bearPower > -0.014291 )
						if( ema2 <= 17.7607 )
							if( ema1 <= 16.0394 )
								if( ema13 <= 0.00211 )
									ret := -0.378378
								if( ema13 > 0.00211 )
									ret := 0.238095
							if( ema1 > 16.0394 )
								if( ema3 <= 16.2488 )
									ret := 0.448980
								if( ema3 > 16.2488 )
									ret := 0.047957
						if( ema2 > 17.7607 )
							ret := -0.818182 // sell
				if( bbm > 0.003523 )
					if( ema2 <= 16.5016 )
						if( ema1 <= 16.1575 )
							if( ema12 <= -0.021819 )
								if( ema12 <= -0.057028 )
									ret := -0.207547
								if( ema12 > -0.057028 )
									ret := 0.235650
							if( ema12 > -0.021819 )
								if( ema12 <= -0.001343 )
									ret := -0.189462
								if( ema12 > -0.001343 )
									ret := 0.081911
						if( ema1 > 16.1575 )
							if( bearPower <= -0.109145 )
								if( bbp <= -0.143874 )
									ret := -0.808000 // sell
								if( bbp > -0.143874 )
									ret := 0.125000
							if( bearPower > -0.109145 )
								if( bbm <= 0.100115 )
									ret := -0.179090
								if( bbm > 0.100115 )
									ret := 1.000000 // buy
					if( ema2 > 16.5016 )
						if( ema3 <= 17.2819 )
							if( bearPower <= -0.076309 )
								if( tema <= 16.4 )
									ret := -0.894737 // sell
								if( tema > 16.4 )
									ret := 0.441048
							if( bearPower > -0.076309 )
								if( ema2 <= 17.2244 )
									ret := 0.011567
								if( ema2 > 17.2244 )
									ret := 0.606452
						if( ema3 > 17.2819 )
							if( bullPower <= -0.171762 )
								if( bbm <= 0.141621 )
									ret := 0.818182 // buy
								if( bbm > 0.141621 )
									ret := 1.000000 // buy
							if( bullPower > -0.171762 )
								if( bbp <= -0.241012 )
									ret := -0.580000
								if( bbp > -0.241012 )
									ret := -0.067352
	if( bbp > 0.014938 )
		if( bbm <= 0.001184 )
			if( tema <= 10.1067 )
				if( ema2 <= 9.97849 )
					if( ema1 <= 9.76443 )
						if( bearPower <= 0.009177 )
							if( tema <= 9.76674 )
								ret := 0.333333
							if( tema > 9.76674 )
								ret := 1.000000 // buy
						if( bearPower > 0.009177 )
							if( bbp <= 0.029063 )
								if( tema <= 9.73746 )
									ret := -0.566667
								if( tema > 9.73746 )
									ret := -0.076923
							if( bbp > 0.029063 )
								if( tema <= 9.72428 )
									ret := -0.100000
								if( tema > 9.72428 )
									ret := 0.500000
					if( ema1 > 9.76443 )
						if( ema12 <= 0.007074 )
							ret := -1.000000 // sell
						if( ema12 > 0.007074 )
							if( ema13 <= 0.036999 )
								ret := -0.125000
							if( ema13 > 0.036999 )
								ret := -0.750000 // sell
				if( ema2 > 9.97849 )
					if( ema3 <= 9.98727 )
						ret := 1.000000 // buy
					if( ema3 > 9.98727 )
						if( bearPower <= 0.013119 )
							ret := -0.363636
						if( bearPower > 0.013119 )
							if( ema2 <= 10.0627 )
								ret := -0.111111
							if( ema2 > 10.0627 )
								ret := 0.625000
			if( tema > 10.1067 )
				if( bearPower <= 0.018651 )
					if( tema <= 16.0833 )
						if( ema1 <= 10.3131 )
							if( ema1 <= 10.2173 )
								if( ema2 <= 10.1338 )
									ret := -1.000000 // sell
								if( ema2 > 10.1338 )
									ret := -0.176471
							if( ema1 > 10.2173 )
								ret := -1.000000 // sell
						if( ema1 > 10.3131 )
							if( ema13 <= 0.008585 )
								if( ema12 <= -0.001832 )
									ret := -0.651852
								if( ema12 > -0.001832 )
									ret := -0.304270
							if( ema13 > 0.008585 )
								if( ema1 <= 11.2947 )
									ret := -0.337209
								if( ema1 > 11.2947 )
									ret := 0.025783
					if( tema > 16.0833 )
						if( tema <= 16.2392 )
							if( ema12 <= 0.005767 )
								if( ema1 <= 16.1404 )
									ret := 0.666667
								if( ema1 > 16.1404 )
									ret := 0.896552 // buy
							if( ema12 > 0.005767 )
								if( ema12 <= 0.008869 )
									ret := 0.157895
								if( ema12 > 0.008869 )
									ret := 0.777778 // buy
						if( tema > 16.2392 )
							if( ema12 <= 0.00673 )
								if( ema13 <= -0.01585 )
									ret := 0.769231 // buy
								if( ema13 > -0.01585 )
									ret := 0.111111
							if( ema12 > 0.00673 )
								if( ema2 <= 16.5825 )
									ret := -0.653061
								if( ema2 > 16.5825 )
									ret := 0.000000
				if( bearPower > 0.018651 )
					if( bearPower <= 0.120189 )
						if( ema1 <= 11.2345 )
							if( ema3 <= 10.7187 )
								if( ema1 <= 10.2476 )
									ret := -0.923077 // sell
								if( ema1 > 10.2476 )
									ret := -0.384615
							if( ema3 > 10.7187 )
								if( ema12 <= 0.022481 )
									ret := -0.152381
								if( ema12 > 0.022481 )
									ret := 0.657143
						if( ema1 > 11.2345 )
							if( ema13 <= 0.037533 )
								if( bullPower <= 0.024974 )
									ret := -0.385882
								if( bullPower > 0.024974 )
									ret := -0.651803
							if( ema13 > 0.037533 )
								if( bearPower <= 0.041591 )
									ret := 0.060811
								if( bearPower > 0.041591 )
									ret := -0.378378
					if( bearPower > 0.120189 )
						if( tema <= 14.6767 )
							ret := 0.240000
						if( tema > 14.6767 )
							if( ema2 <= 16.22 )
								ret := -0.916667 // sell
							if( ema2 > 16.22 )
								ret := 0.250000
		if( bbm > 0.001184 )
			if( bbp <= 0.054211 )
				if( tema <= 17.3741 )
					if( tema <= 9.55143 )
						if( bbp <= 0.020677 )
							if( ema13 <= -0.004213 )
								ret := 1.000000 // buy
							if( ema13 > -0.004213 )
								if( ema12 <= 0.009956 )
									ret := -0.333333
								if( ema12 > 0.009956 )
									ret := 0.600000
						if( bbp > 0.020677 )
							if( tema <= 9.12129 )
								ret := 0.666667
							if( tema > 9.12129 )
								if( ema3 <= 9.4116 )
									ret := -0.505263
								if( ema3 > 9.4116 )
									ret := -0.917647 // sell
					if( tema > 9.55143 )
						if( tema <= 17.2535 )
							if( tema <= 16.8886 )
								if( ema3 <= 15.6066 )
									ret := -0.055816
								if( ema3 > 15.6066 )
									ret := 0.083691
							if( tema > 16.8886 )
								if( bbm <= 0.016654 )
									ret := -0.075949
								if( bbm > 0.016654 )
									ret := -0.296813
						if( tema > 17.2535 )
							if( bullPower <= 0.034415 )
								if( bbp <= 0.027352 )
									ret := 0.614035
								if( bbp > 0.027352 )
									ret := -0.225806
							if( bullPower > 0.034415 )
								if( ema2 <= 17.3277 )
									ret := 0.696970
								if( ema2 > 17.3277 )
									ret := -0.444444
				if( tema > 17.3741 )
					if( ema1 <= 17.5499 )
						if( ema3 <= 17.4645 )
							if( ema12 <= 0.00998 )
								if( ema2 <= 17.3839 )
									ret := -1.000000 // sell
								if( ema2 > 17.3839 )
									ret := -0.644860
							if( ema12 > 0.00998 )
								if( bearPower <= -0.033568 )
									ret := 0.666667
								if( bearPower > -0.033568 )
									ret := -0.136364
						if( ema3 > 17.4645 )
							if( ema3 <= 17.506 )
								if( ema2 <= 17.483 )
									ret := -0.100000
								if( ema2 > 17.483 )
									ret := 0.828571 // buy
							if( ema3 > 17.506 )
								if( ema13 <= -0.014233 )
									ret := 0.681818
								if( ema13 > -0.014233 )
									ret := -0.536585
					if( ema1 > 17.5499 )
						if( bbm <= 0.010773 )
							ret := -0.058824
						if( bbm > 0.010773 )
							if( ema13 <= 0.034148 )
								if( bearPower <= 0.001154 )
									ret := -0.679245
								if( bearPower > 0.001154 )
									ret := -0.869565 // sell
							if( ema13 > 0.034148 )
								if( ema2 <= 17.6193 )
									ret := -0.984127 // sell
								if( ema2 > 17.6193 )
									ret := -0.545455
			if( bbp > 0.054211 )
				if( bearPower <= 0.029225 )
					if( ema2 <= 12.4542 )
						if( tema <= 11.0664 )
							if( ema1 <= 10.4929 )
								if( bullPower <= 0.10016 )
									ret := 0.096774
								if( bullPower > 0.10016 )
									ret := -0.508197
							if( ema1 > 10.4929 )
								if( ema13 <= 0.031382 )
									ret := -0.684211
								if( ema13 > 0.031382 )
									ret := -0.133333
						if( tema > 11.0664 )
							if( ema2 <= 11.3099 )
								if( ema12 <= 0.029468 )
									ret := 0.312500
								if( ema12 > 0.029468 )
									ret := 0.898734 // buy
							if( ema2 > 11.3099 )
								if( ema2 <= 12.4061 )
									ret := -0.021941
								if( ema2 > 12.4061 )
									ret := 0.372881
					if( ema2 > 12.4542 )
						if( ema1 <= 12.732 )
							if( ema3 <= 12.6152 )
								if( bearPower <= 0.01481 )
									ret := -0.805970 // sell
								if( bearPower > 0.01481 )
									ret := -0.226667
							if( ema3 > 12.6152 )
								if( tema <= 12.7319 )
									ret := -0.979167 // sell
								if( tema > 12.7319 )
									ret := -0.850000 // sell
						if( ema1 > 12.732 )
							if( ema2 <= 17.5531 )
								if( ema2 <= 17.3166 )
									ret := -0.125987
								if( ema2 > 17.3166 )
									ret := 0.258621
							if( ema2 > 17.5531 )
								if( ema3 <= 17.645 )
									ret := -0.938776 // sell
								if( ema3 > 17.645 )
									ret := -0.267857
				if( bearPower > 0.029225 )
					if( ema13 <= 0.100437 )
						if( ema3 <= 12.4413 )
							if( ema13 <= 0.027428 )
								if( tema <= 11.2601 )
									ret := -0.744681 // sell
								if( tema > 11.2601 )
									ret := -0.307229
							if( ema13 > 0.027428 )
								if( bbm <= 0.029172 )
									ret := -0.135731
								if( bbm > 0.029172 )
									ret := 0.137391
						if( ema3 > 12.4413 )
							if( ema3 <= 15.7613 )
								if( ema2 <= 12.5764 )
									ret := -0.705036 // sell
								if( ema2 > 12.5764 )
									ret := -0.334523
							if( ema3 > 15.7613 )
								if( ema12 <= 0.030416 )
									ret := -0.018605
								if( ema12 > 0.030416 )
									ret := -0.281984
					if( ema13 > 0.100437 )
						if( bullPower <= 0.114846 )
							if( ema13 <= 0.138067 )
								if( bearPower <= 0.074851 )
									ret := 0.282895
								if( bearPower > 0.074851 )
									ret := -0.560000
							if( ema13 > 0.138067 )
								if( ema3 <= 16.1384 )
									ret := 0.960784 // buy
								if( ema3 > 16.1384 )
									ret := 0.250000
						if( bullPower > 0.114846 )
							if( ema3 <= 12.909 )
								if( ema12 <= 0.067443 )
									ret := -0.321429
								if( ema12 > 0.067443 )
									ret := -0.705882 // sell
							if( ema3 > 12.909 )
								if( ema3 <= 16.2306 )
									ret := 0.274510
								if( ema3 > 16.2306 )
									ret := -0.380000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_LYFT_1Min_0629b772(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


