//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: XRPUSDT_30Min_1T00_dc196c6e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1T00_dc196c6e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_dc196c6e(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.002572 )
		if( ema2 <= 0.783955 )
			if( ema12 <= -0.00474 )
				if( ema12 <= -0.020528 )
					if( ema2 <= 0.58075 )
						if( ema13 <= -0.050416 )
							if( ema2 <= 0.448037 )
								ret := -0.500000
							if( ema2 > 0.448037 )
								if( ema2 <= 0.486604 )
									ret := 0.916667 // buy
								if( ema2 > 0.486604 )
									ret := 0.571429
						if( ema13 > -0.050416 )
							if( ema12 <= -0.021407 )
								if( ema13 <= -0.039178 )
									ret := 1.000000 // buy
								if( ema13 > -0.039178 )
									ret := 0.900000 // buy
							if( ema12 > -0.021407 )
								ret := 0.600000
					if( ema2 > 0.58075 )
						if( tema <= 0.585598 )
							if( ema2 <= 0.623467 )
								if( ema13 <= -0.03945 )
									ret := -0.500000
								if( ema13 > -0.03945 )
									ret := 0.777778 // buy
							if( ema2 > 0.623467 )
								ret := -1.000000 // sell
						if( tema > 0.585598 )
							if( ema3 <= 0.776957 )
								ret := 1.000000 // buy
							if( ema3 > 0.776957 )
								ret := 0.500000
				if( ema12 > -0.020528 )
					if( ema13 <= -0.02143 )
						if( ema2 <= 0.709315 )
							if( ema2 <= 0.617079 )
								if( tema <= 0.336084 )
									ret := 0.636364
								if( tema > 0.336084 )
									ret := -0.060606
							if( ema2 > 0.617079 )
								if( ema13 <= -0.023364 )
									ret := 0.750000 // buy
								if( ema13 > -0.023364 )
									ret := -0.083333
						if( ema2 > 0.709315 )
							if( ema3 <= 0.739972 )
								if( ema13 <= -0.027814 )
									ret := -0.250000
								if( ema13 > -0.027814 )
									ret := -0.937500 // sell
							if( ema3 > 0.739972 )
								if( ema1 <= 0.711527 )
									ret := 1.000000 // buy
								if( ema1 > 0.711527 )
									ret := -0.195122
					if( ema13 > -0.02143 )
						if( tema <= 0.756094 )
							if( ema3 <= 0.530364 )
								if( ema2 <= 0.474823 )
									ret := 0.272497
								if( ema2 > 0.474823 )
									ret := 0.562005
							if( ema3 > 0.530364 )
								if( ema2 <= 0.541745 )
									ret := -0.209040
								if( ema2 > 0.541745 )
									ret := 0.247071
						if( tema > 0.756094 )
							if( ema13 <= -0.008579 )
								if( ema13 <= -0.017035 )
									ret := 0.000000
								if( ema13 > -0.017035 )
									ret := 0.781250 // buy
							if( ema13 > -0.008579 )
								ret := -0.166667
			if( ema12 > -0.00474 )
				if( ema1 <= 0.470433 )
					if( ema2 <= 0.428679 )
						if( ema13 <= -0.003808 )
							if( ema3 <= 0.427044 )
								if( ema13 <= -0.008954 )
									ret := -0.191489
								if( ema13 > -0.008954 )
									ret := 0.146384
							if( ema3 > 0.427044 )
								if( ema1 <= 0.424476 )
									ret := -0.642857
								if( ema1 > 0.424476 )
									ret := 0.400000
						if( ema13 > -0.003808 )
							if( ema12 <= -0.002588 )
								if( ema13 <= -0.003093 )
									ret := 0.491525
								if( ema13 > -0.003093 )
									ret := 0.852941 // buy
							if( ema12 > -0.002588 )
								ret := -0.750000 // sell
					if( ema2 > 0.428679 )
						if( ema3 <= 0.436981 )
							if( ema12 <= -0.002766 )
								if( tema <= 0.426037 )
									ret := 0.958333 // buy
								if( tema > 0.426037 )
									ret := 0.750000 // buy
							if( ema12 > -0.002766 )
								ret := 0.000000
						if( ema3 > 0.436981 )
							if( ema3 <= 0.439851 )
								if( tema <= 0.429877 )
									ret := -0.764706 // sell
								if( tema > 0.429877 )
									ret := 0.400000
							if( ema3 > 0.439851 )
								if( tema <= 0.43181 )
									ret := 0.862745 // buy
								if( tema > 0.43181 )
									ret := 0.313131
				if( ema1 > 0.470433 )
					if( ema13 <= -0.007036 )
						if( ema3 <= 0.481929 )
							if( tema <= 0.470852 )
								if( ema2 <= 0.476375 )
									ret := -0.750000 // sell
								if( ema2 > 0.476375 )
									ret := -1.000000 // sell
							if( tema > 0.470852 )
								ret := -0.500000
						if( ema3 > 0.481929 )
							if( ema1 <= 0.475052 )
								if( ema3 <= 0.482755 )
									ret := 0.500000
								if( ema3 > 0.482755 )
									ret := 1.000000 // buy
							if( ema1 > 0.475052 )
								if( ema2 <= 0.610159 )
									ret := 0.014467
								if( ema2 > 0.610159 )
									ret := -0.177928
					if( ema13 > -0.007036 )
						if( tema <= 0.47119 )
							if( ema3 <= 0.478 )
								if( ema3 <= 0.477118 )
									ret := -0.500000
								if( ema3 > 0.477118 )
									ret := -0.944444 // sell
							if( ema3 > 0.478 )
								if( tema <= 0.469808 )
									ret := -0.166667
								if( tema > 0.469808 )
									ret := -0.750000 // sell
						if( tema > 0.47119 )
							if( ema13 <= -0.00464 )
								if( ema2 <= 0.513349 )
									ret := 0.050542
								if( ema2 > 0.513349 )
									ret := 0.280139
							if( ema13 > -0.00464 )
								if( tema <= 0.607693 )
									ret := -0.106383
								if( tema > 0.607693 )
									ret := 0.181132
		if( ema2 > 0.783955 )
			if( ema12 <= -0.01843 )
				if( ema13 <= -0.064909 )
					if( ema3 <= 1.55598 )
						if( ema1 <= 1.11473 )
							if( ema2 <= 0.909683 )
								if( ema13 <= -0.086954 )
									ret := 1.000000 // buy
								if( ema13 > -0.086954 )
									ret := -0.727273 // sell
							if( ema2 > 0.909683 )
								if( ema13 <= -0.098615 )
									ret := 0.000000
								if( ema13 > -0.098615 )
									ret := 0.846154 // buy
						if( ema1 > 1.11473 )
							if( ema13 <= -0.101639 )
								if( ema12 <= -0.081571 )
									ret := 1.000000 // buy
								if( ema12 > -0.081571 )
									ret := 0.769231 // buy
							if( ema13 > -0.101639 )
								if( ema13 <= -0.077925 )
									ret := -0.830189 // sell
								if( ema13 > -0.077925 )
									ret := -0.200000
					if( ema3 > 1.55598 )
						if( ema1 <= 1.59499 )
							ret := 1.000000 // buy
						if( ema1 > 1.59499 )
							if( ema2 <= 1.76742 )
								ret := 0.250000
							if( ema2 > 1.76742 )
								ret := 1.000000 // buy
				if( ema13 > -0.064909 )
					if( tema <= 1.40217 )
						if( ema2 <= 1.19068 )
							if( ema13 <= -0.039118 )
								if( tema <= 0.939418 )
									ret := 0.722222 // buy
								if( tema > 0.939418 )
									ret := 0.103896
							if( ema13 > -0.039118 )
								if( ema2 <= 0.825638 )
									ret := 1.000000 // buy
								if( ema2 > 0.825638 )
									ret := -0.184211
						if( ema2 > 1.19068 )
							if( ema13 <= -0.028777 )
								if( ema1 <= 1.4041 )
									ret := 0.680180
								if( ema1 > 1.4041 )
									ret := 0.323529
							if( ema13 > -0.028777 )
								ret := -0.500000
					if( tema > 1.40217 )
						if( ema1 <= 1.55982 )
							if( ema12 <= -0.029105 )
								if( ema2 <= 1.54819 )
									ret := 0.300000
								if( ema2 > 1.54819 )
									ret := -1.000000 // sell
							if( ema12 > -0.029105 )
								if( ema13 <= -0.03497 )
									ret := -1.000000 // sell
								if( ema13 > -0.03497 )
									ret := -0.500000
						if( ema1 > 1.55982 )
							if( ema3 <= 1.69097 )
								if( ema13 <= -0.051166 )
									ret := 0.333333
								if( ema13 > -0.051166 )
									ret := 0.854167 // buy
							if( ema3 > 1.69097 )
								if( ema2 <= 1.70881 )
									ret := -1.000000 // sell
								if( ema2 > 1.70881 )
									ret := 0.222222
			if( ema12 > -0.01843 )
				if( ema1 <= 1.40484 )
					if( ema1 <= 1.01498 )
						if( ema3 <= 0.942245 )
							if( ema2 <= 0.817278 )
								if( tema <= 0.791597 )
									ret := 0.000000
								if( tema > 0.791597 )
									ret := -0.525180
							if( ema2 > 0.817278 )
								if( tema <= 0.817151 )
									ret := 0.500000
								if( tema > 0.817151 )
									ret := 0.062222
						if( ema3 > 0.942245 )
							if( ema13 <= -0.001993 )
								if( ema1 <= 0.92238 )
									ret := 1.000000 // buy
								if( ema1 > 0.92238 )
									ret := -0.298587
							if( ema13 > -0.001993 )
								if( ema13 <= -0.001463 )
									ret := 0.666667
								if( ema13 > -0.001463 )
									ret := 1.000000 // buy
					if( ema1 > 1.01498 )
						if( ema13 <= -0.009691 )
							if( tema <= 1.35505 )
								if( ema2 <= 1.37213 )
									ret := 0.234218
								if( ema2 > 1.37213 )
									ret := -0.833333 // sell
							if( tema > 1.35505 )
								if( ema13 <= -0.011939 )
									ret := 0.752688 // buy
								if( ema13 > -0.011939 )
									ret := -0.750000 // sell
						if( ema13 > -0.009691 )
							if( ema3 <= 1.0394 )
								if( ema13 <= -0.007608 )
									ret := 0.000000
								if( ema13 > -0.007608 )
									ret := 0.818182 // buy
							if( ema3 > 1.0394 )
								if( ema3 <= 1.37351 )
									ret := 0.037671
								if( ema3 > 1.37351 )
									ret := -0.696970
				if( ema1 > 1.40484 )
					if( ema3 <= 1.56747 )
						if( ema13 <= -0.002757 )
							if( ema1 <= 1.46679 )
								if( ema12 <= -0.01703 )
									ret := -0.625000
								if( ema12 > -0.01703 )
									ret := -0.939024 // sell
							if( ema1 > 1.46679 )
								if( ema1 <= 1.5284 )
									ret := -0.236364
								if( ema1 > 1.5284 )
									ret := -0.818182 // sell
						if( ema13 > -0.002757 )
							if( ema3 <= 1.53149 )
								if( ema2 <= 1.41845 )
									ret := -0.250000
								if( ema2 > 1.41845 )
									ret := 0.650000
							if( ema3 > 1.53149 )
								ret := -1.000000 // sell
					if( ema3 > 1.56747 )
						if( tema <= 1.56907 )
							if( ema1 <= 1.56058 )
								if( ema1 <= 1.55535 )
									ret := 0.250000
								if( ema1 > 1.55535 )
									ret := -0.812500 // sell
							if( ema1 > 1.56058 )
								if( tema <= 1.55742 )
									ret := 0.878049 // buy
								if( tema > 1.55742 )
									ret := 0.200000
						if( tema > 1.56907 )
							if( ema1 <= 1.62762 )
								if( ema2 <= 1.59546 )
									ret := -0.233333
								if( ema2 > 1.59546 )
									ret := -0.893939 // sell
							if( ema1 > 1.62762 )
								if( ema2 <= 1.74117 )
									ret := 0.763636 // buy
								if( ema2 > 1.74117 )
									ret := -0.257143
	if( ema12 > -0.002572 )
		if( ema1 <= 1.58281 )
			if( ema1 <= 1.42135 )
				if( ema2 <= 0.60789 )
					if( ema1 <= 0.231432 )
						if( ema13 <= 0.003106 )
							if( ema13 <= -0.00267 )
								if( ema3 <= 0.214197 )
									ret := 0.933333 // buy
								if( ema3 > 0.214197 )
									ret := -0.233333
							if( ema13 > -0.00267 )
								if( ema1 <= 0.23019 )
									ret := 0.414716
								if( ema1 > 0.23019 )
									ret := 0.738095 // buy
						if( ema13 > 0.003106 )
							if( ema3 <= 0.210459 )
								if( ema2 <= 0.210151 )
									ret := -0.727273 // sell
								if( ema2 > 0.210151 )
									ret := 0.964286 // buy
							if( ema3 > 0.210459 )
								if( ema3 <= 0.224463 )
									ret := -0.921569 // sell
								if( ema3 > 0.224463 )
									ret := 0.666667
					if( ema1 > 0.231432 )
						if( ema13 <= 0.007213 )
							if( ema12 <= -0.001428 )
								if( ema1 <= 0.237197 )
									ret := 0.571429
								if( ema1 > 0.237197 )
									ret := 0.110050
							if( ema12 > -0.001428 )
								if( ema13 <= 0.001279 )
									ret := 0.019955
								if( ema13 > 0.001279 )
									ret := 0.076785
						if( ema13 > 0.007213 )
							if( ema1 <= 0.239191 )
								ret := -1.000000 // sell
							if( ema1 > 0.239191 )
								if( ema13 <= 0.014422 )
									ret := -0.096975
								if( ema13 > 0.014422 )
									ret := 0.084642
				if( ema2 > 0.60789 )
					if( ema2 <= 0.701609 )
						if( ema13 <= 0.027881 )
							if( ema2 <= 0.691192 )
								if( ema3 <= 0.687763 )
									ret := -0.048866
								if( ema3 > 0.687763 )
									ret := 0.437500
							if( ema2 > 0.691192 )
								if( ema12 <= 0.001399 )
									ret := -0.448649
								if( ema12 > 0.001399 )
									ret := -0.102941
						if( ema13 > 0.027881 )
							if( ema1 <= 0.76079 )
								if( ema3 <= 0.679802 )
									ret := -0.706522 // sell
								if( ema3 > 0.679802 )
									ret := 0.500000
							if( ema1 > 0.76079 )
								ret := 1.000000 // buy
					if( ema2 > 0.701609 )
						if( ema3 <= 0.747839 )
							if( tema <= 0.728167 )
								if( ema2 <= 0.724211 )
									ret := 0.093148
								if( ema2 > 0.724211 )
									ret := -0.544304
							if( tema > 0.728167 )
								if( ema3 <= 0.731918 )
									ret := 0.456790
								if( ema3 > 0.731918 )
									ret := 0.110638
						if( ema3 > 0.747839 )
							if( ema2 <= 0.758108 )
								if( ema13 <= 0.00266 )
									ret := -0.580645
								if( ema13 > 0.00266 )
									ret := 0.106195
							if( ema2 > 0.758108 )
								if( ema3 <= 0.759133 )
									ret := 0.514925
								if( ema3 > 0.759133 )
									ret := 0.000329
			if( ema1 > 1.42135 )
				if( ema12 <= 0.008785 )
					if( ema2 <= 1.56835 )
						if( ema12 <= 0.007617 )
							if( ema13 <= -0.002873 )
								ret := -0.285714
							if( ema13 > -0.002873 )
								if( ema13 <= 0.012389 )
									ret := 0.900662 // buy
								if( ema13 > 0.012389 )
									ret := 0.555556
						if( ema12 > 0.007617 )
							if( ema13 <= 0.015794 )
								if( ema12 <= 0.008379 )
									ret := 0.833333 // buy
								if( ema12 > 0.008379 )
									ret := 0.500000
							if( ema13 > 0.015794 )
								if( ema13 <= 0.020733 )
									ret := -1.000000 // sell
								if( ema13 > 0.020733 )
									ret := 0.500000
					if( ema2 > 1.56835 )
						if( ema2 <= 1.5695 )
							if( ema12 <= -0.000731 )
								ret := -0.200000
							if( ema12 > -0.000731 )
								ret := -1.000000 // sell
						if( ema2 > 1.5695 )
							if( ema12 <= 0.004707 )
								if( ema13 <= 0.000748 )
									ret := -0.032258
								if( ema13 > 0.000748 )
									ret := 0.686275
							if( ema12 > 0.004707 )
								if( tema <= 1.59014 )
									ret := -1.000000 // sell
								if( tema > 1.59014 )
									ret := 0.000000
				if( ema12 > 0.008785 )
					if( ema3 <= 1.41478 )
						if( ema13 <= 0.05841 )
							if( ema1 <= 1.45098 )
								if( ema3 <= 1.38394 )
									ret := 0.750000 // buy
								if( ema3 > 1.38394 )
									ret := 0.979167 // buy
							if( ema1 > 1.45098 )
								ret := 0.142857
						if( ema13 > 0.05841 )
							if( ema12 <= 0.03974 )
								if( ema12 <= 0.031981 )
									ret := -1.000000 // sell
								if( ema12 > 0.031981 )
									ret := -0.666667
							if( ema12 > 0.03974 )
								ret := 0.000000
					if( ema3 > 1.41478 )
						if( ema1 <= 1.5252 )
							if( ema1 <= 1.50873 )
								if( ema1 <= 1.44207 )
									ret := -1.000000 // sell
								if( ema1 > 1.44207 )
									ret := 0.267606
							if( ema1 > 1.50873 )
								ret := -1.000000 // sell
						if( ema1 > 1.5252 )
							if( tema <= 1.57168 )
								if( ema13 <= 0.021122 )
									ret := 0.400000
								if( ema13 > 0.021122 )
									ret := 0.851064 // buy
							if( tema > 1.57168 )
								if( ema13 <= 0.071796 )
									ret := -0.348837
								if( ema13 > 0.071796 )
									ret := 1.000000 // buy
		if( ema1 > 1.58281 )
			if( tema <= 1.60987 )
				if( ema13 <= 0.008112 )
					if( ema2 <= 1.58397 )
						if( ema2 <= 1.58134 )
							ret := -0.800000 // sell
						if( ema2 > 1.58134 )
							ret := -0.142857
					if( ema2 > 1.58397 )
						if( ema1 <= 1.59119 )
							if( ema12 <= 0.002741 )
								ret := -1.000000 // sell
							if( ema12 > 0.002741 )
								ret := -0.750000 // sell
						if( ema1 > 1.59119 )
							if( ema13 <= 0.004258 )
								if( tema <= 1.59242 )
									ret := -0.750000 // sell
								if( tema > 1.59242 )
									ret := 0.000000
							if( ema13 > 0.004258 )
								if( tema <= 1.60217 )
									ret := -0.250000
								if( tema > 1.60217 )
									ret := -1.000000 // sell
				if( ema13 > 0.008112 )
					if( ema2 <= 1.57696 )
						ret := -0.750000 // sell
					if( ema2 > 1.57696 )
						if( ema2 <= 1.57985 )
							if( ema2 <= 1.57871 )
								ret := -1.000000 // sell
							if( ema2 > 1.57871 )
								ret := -0.750000 // sell
						if( ema2 > 1.57985 )
							ret := -1.000000 // sell
			if( tema > 1.60987 )
				if( tema <= 1.80286 )
					if( ema1 <= 1.69208 )
						if( ema13 <= 0.078372 )
							if( ema13 <= 0.00503 )
								if( tema <= 1.65552 )
									ret := 0.888889 // buy
								if( tema > 1.65552 )
									ret := -0.444444
							if( ema13 > 0.00503 )
								if( ema3 <= 1.62176 )
									ret := -0.603960
								if( ema3 > 1.62176 )
									ret := -0.956522 // sell
						if( ema13 > 0.078372 )
							if( ema13 <= 0.093212 )
								ret := 1.000000 // buy
							if( ema13 > 0.093212 )
								ret := 0.750000 // buy
					if( ema1 > 1.69208 )
						if( ema2 <= 1.77755 )
							if( ema3 <= 1.75067 )
								if( ema1 <= 1.75089 )
									ret := 0.900000 // buy
								if( ema1 > 1.75089 )
									ret := 0.500000
							if( ema3 > 1.75067 )
								ret := -0.666667
						if( ema2 > 1.77755 )
							ret := 1.000000 // buy
				if( tema > 1.80286 )
					if( ema12 <= 0.018797 )
						ret := 0.500000
					if( ema12 > 0.018797 )
						if( ema2 <= 1.75055 )
							if( ema2 <= 1.74705 )
								ret := -0.750000 // sell
							if( ema2 > 1.74705 )
								ret := -0.250000
						if( ema2 > 1.75055 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_XRPUSDT_30Min_dc196c6e(ema2, tema, ema12, ema3, ema1, ema13)

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


