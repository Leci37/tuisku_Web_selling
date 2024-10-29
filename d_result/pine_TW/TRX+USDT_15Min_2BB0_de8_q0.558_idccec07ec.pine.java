//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: TRXUSDT_15Min_2BB0_ccec07ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2BB0_ccec07ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_ccec07ec(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Lower_Band <= 0.065879 )
		if( bbp <= -0.000106 )
			if( bearPower <= -0.000616 )
				if( basis <= 0.050111 )
					if( Upper_Band <= 0.051234 )
						ret := 0.750000 // buy
					if( Upper_Band > 0.051234 )
						ret := 1.000000 // buy
				if( basis > 0.050111 )
					if( basis <= 0.057834 )
						if( Upper_Band <= 0.058409 )
							if( Lower_Band <= 0.048759 )
								if( Lower_Band <= 0.047613 )
									ret := 1.000000 // buy
								if( Lower_Band > 0.047613 )
									ret := -0.860000 // sell
							if( Lower_Band > 0.048759 )
								if( bbm <= 0.000295 )
									ret := 0.863636 // buy
								if( bbm > 0.000295 )
									ret := -0.131944
						if( Upper_Band > 0.058409 )
							if( Lower_Band <= 0.052449 )
								if( bearPower <= -0.001486 )
									ret := 1.000000 // buy
								if( bearPower > -0.001486 )
									ret := -1.000000 // sell
							if( Lower_Band > 0.052449 )
								if( Upper_Band <= 0.059007 )
									ret := -0.450000
								if( Upper_Band > 0.059007 )
									ret := -0.904762 // sell
					if( basis > 0.057834 )
						if( bbp <= -0.002466 )
							if( bbm <= 0.000965 )
								if( bbm <= 0.000731 )
									ret := 0.768116 // buy
								if( bbm > 0.000731 )
									ret := 0.975610 // buy
							if( bbm > 0.000965 )
								if( Upper_Band <= 0.063595 )
									ret := -0.529412
								if( Upper_Band > 0.063595 )
									ret := 0.536842
						if( bbp > -0.002466 )
							if( Lower_Band <= 0.059131 )
								if( basis <= 0.059355 )
									ret := 0.100000
								if( basis > 0.059355 )
									ret := 0.642857
							if( Lower_Band > 0.059131 )
								if( bearPower <= -0.001561 )
									ret := -0.740000 // sell
								if( bearPower > -0.001561 )
									ret := 0.011851
			if( bearPower > -0.000616 )
				if( Lower_Band <= 0.0535 )
					if( bearPower <= -0.000123 )
						if( Upper_Band <= 0.055232 )
							if( Upper_Band <= 0.053511 )
								if( basis <= 0.053199 )
									ret := 0.351964
								if( basis > 0.053199 )
									ret := -0.882353 // sell
							if( Upper_Band > 0.053511 )
								if( bbp <= -0.000241 )
									ret := 0.682081
								if( bbp > -0.000241 )
									ret := 0.270833
						if( Upper_Band > 0.055232 )
							if( Lower_Band <= 0.0525 )
								ret := -1.000000 // sell
							if( Lower_Band > 0.0525 )
								if( Upper_Band <= 0.055567 )
									ret := 0.750000 // buy
								if( Upper_Band > 0.055567 )
									ret := 1.000000 // buy
					if( bearPower > -0.000123 )
						if( Upper_Band <= 0.05243 )
							if( Lower_Band <= 0.051648 )
								if( Lower_Band <= 0.051452 )
									ret := -0.200000
								if( Lower_Band > 0.051452 )
									ret := 0.400000
							if( Lower_Band > 0.051648 )
								if( bearPower <= -9.6e-05 )
									ret := -1.000000 // sell
								if( bearPower > -9.6e-05 )
									ret := -0.500000
						if( Upper_Band > 0.05243 )
							if( Lower_Band <= 0.051987 )
								if( Lower_Band <= 0.051934 )
									ret := 0.750000 // buy
								if( Lower_Band > 0.051934 )
									ret := 1.000000 // buy
							if( Lower_Band > 0.051987 )
								if( Lower_Band <= 0.052861 )
									ret := -0.200000
								if( Lower_Band > 0.052861 )
									ret := 0.372549
				if( Lower_Band > 0.0535 )
					if( basis <= 0.058243 )
						if( Upper_Band <= 0.057277 )
							if( basis <= 0.056694 )
								if( Upper_Band <= 0.05578 )
									ret := 0.115925
								if( Upper_Band > 0.05578 )
									ret := -0.211982
							if( basis > 0.056694 )
								ret := 1.000000 // buy
						if( Upper_Band > 0.057277 )
							if( bbp <= -0.000185 )
								if( bbm <= 0.000174 )
									ret := -0.208333
								if( bbm > 0.000174 )
									ret := -0.625000
							if( bbp > -0.000185 )
								if( bullPower <= 1.5e-05 )
									ret := 1.000000 // buy
								if( bullPower > 1.5e-05 )
									ret := -0.105263
					if( basis > 0.058243 )
						if( basis <= 0.06541 )
							if( Upper_Band <= 0.05959 )
								if( bullPower <= 9e-05 )
									ret := 0.850746 // buy
								if( bullPower > 9e-05 )
									ret := 0.111111
							if( Upper_Band > 0.05959 )
								if( bullPower <= 0.000126 )
									ret := 0.196048
								if( bullPower > 0.000126 )
									ret := -0.088083
						if( basis > 0.06541 )
							if( bearPower <= -0.000389 )
								if( basis <= 0.065712 )
									ret := 0.920000 // buy
								if( basis > 0.065712 )
									ret := 0.425806
							if( bearPower > -0.000389 )
								if( Upper_Band <= 0.065751 )
									ret := 0.666667
								if( Upper_Band > 0.065751 )
									ret := 0.190867
		if( bbp > -0.000106 )
			if( basis <= 0.06217 )
				if( bbm <= 0.001353 )
					if( basis <= 0.04951 )
						if( Lower_Band <= 0.048115 )
							if( Upper_Band <= 0.051471 )
								if( Upper_Band <= 0.0509 )
									ret := -0.750000 // sell
								if( Upper_Band > 0.0509 )
									ret := -1.000000 // sell
							if( Upper_Band > 0.051471 )
								if( bbm <= 0.000586 )
									ret := 0.000000
								if( bbm > 0.000586 )
									ret := 1.000000 // buy
						if( Lower_Band > 0.048115 )
							if( bbp <= 0.000514 )
								ret := 1.000000 // buy
							if( bbp > 0.000514 )
								if( Lower_Band <= 0.048817 )
									ret := 0.769231 // buy
								if( Lower_Band > 0.048817 )
									ret := 0.000000
					if( basis > 0.04951 )
						if( bullPower <= 0.001024 )
							if( bbm <= 8e-05 )
								if( Upper_Band <= 0.053374 )
									ret := 0.235808
								if( Upper_Band > 0.053374 )
									ret := -0.016848
							if( bbm > 8e-05 )
								if( Lower_Band <= 0.058044 )
									ret := 0.070655
								if( Lower_Band > 0.058044 )
									ret := 0.155292
						if( bullPower > 0.001024 )
							if( bbm <= 0.000648 )
								if( bbp <= 0.003074 )
									ret := -0.797297 // sell
								if( bbp > 0.003074 )
									ret := 0.200000
							if( bbm > 0.000648 )
								if( bearPower <= 0.001297 )
									ret := -0.042254
								if( bearPower > 0.001297 )
									ret := 0.851852 // buy
				if( bbm > 0.001353 )
					if( bullPower <= 0.004233 )
						if( basis <= 0.059971 )
							if( Lower_Band <= 0.05276 )
								if( basis <= 0.054043 )
									ret := 0.705882 // buy
								if( basis > 0.054043 )
									ret := -0.444444
							if( Lower_Band > 0.05276 )
								if( bbm <= 0.003562 )
									ret := 0.979592 // buy
								if( bbm > 0.003562 )
									ret := 0.571429
						if( basis > 0.059971 )
							if( bullPower <= 0.001664 )
								ret := -0.857143 // sell
							if( bullPower > 0.001664 )
								if( Lower_Band <= 0.056595 )
									ret := -0.750000 // sell
								if( Lower_Band > 0.056595 )
									ret := 0.846154 // buy
					if( bullPower > 0.004233 )
						if( bearPower <= 0.001795 )
							if( basis <= 0.056823 )
								if( bbm <= 0.003507 )
									ret := -1.000000 // sell
								if( bbm > 0.003507 )
									ret := 0.500000
							if( basis > 0.056823 )
								ret := -1.000000 // sell
						if( bearPower > 0.001795 )
							ret := 1.000000 // buy
			if( basis > 0.06217 )
				if( Lower_Band <= 0.064088 )
					if( basis <= 0.064793 )
						if( basis <= 0.063658 )
							if( Lower_Band <= 0.063144 )
								if( Upper_Band <= 0.063835 )
									ret := -0.069869
								if( Upper_Band > 0.063835 )
									ret := 0.123050
							if( Lower_Band > 0.063144 )
								if( bearPower <= 2e-06 )
									ret := 0.345455
								if( bearPower > 2e-06 )
									ret := 0.061983
						if( basis > 0.063658 )
							if( bearPower <= 1.7e-05 )
								if( bullPower <= 2.7e-05 )
									ret := 0.375000
								if( bullPower > 2.7e-05 )
									ret := -0.266090
							if( bearPower > 1.7e-05 )
								if( bearPower <= 0.000822 )
									ret := -0.019002
								if( bearPower > 0.000822 )
									ret := 0.750000 // buy
					if( basis > 0.064793 )
						if( Upper_Band <= 0.066012 )
							if( Lower_Band <= 0.064048 )
								ret := -1.000000 // sell
							if( Lower_Band > 0.064048 )
								if( Lower_Band <= 0.064056 )
									ret := 0.250000
								if( Lower_Band > 0.064056 )
									ret := -0.750000 // sell
						if( Upper_Band > 0.066012 )
							if( bearPower <= 0.001074 )
								if( Lower_Band <= 0.063544 )
									ret := -0.857143 // sell
								if( Lower_Band > 0.063544 )
									ret := 0.043478
							if( bearPower > 0.001074 )
								ret := -1.000000 // sell
				if( Lower_Band > 0.064088 )
					if( Upper_Band <= 0.06549 )
						if( bearPower <= 5.8e-05 )
							if( bbp <= 5.8e-05 )
								if( Lower_Band <= 0.065152 )
									ret := 0.153285
								if( Lower_Band > 0.065152 )
									ret := -1.000000 // sell
							if( bbp > 5.8e-05 )
								if( bullPower <= 0.000162 )
									ret := 0.278571
								if( bullPower > 0.000162 )
									ret := 0.563707
						if( bearPower > 5.8e-05 )
							if( bbm <= 0.000212 )
								if( basis <= 0.065191 )
									ret := 0.056452
								if( basis > 0.065191 )
									ret := 1.000000 // buy
							if( bbm > 0.000212 )
								if( bearPower <= 0.000184 )
									ret := -0.578947
								if( bearPower > 0.000184 )
									ret := 0.090909
					if( Upper_Band > 0.06549 )
						if( basis <= 0.06496 )
							if( bbm <= 0.000201 )
								ret := -0.250000
							if( bbm > 0.000201 )
								if( bbp <= 0.000349 )
									ret := -0.750000 // sell
								if( bbp > 0.000349 )
									ret := -1.000000 // sell
						if( basis > 0.06496 )
							if( bearPower <= 0.000406 )
								if( bearPower <= 7.7e-05 )
									ret := 0.056306
								if( bearPower > 7.7e-05 )
									ret := -0.132999
							if( bearPower > 0.000406 )
								if( bbp <= 0.001687 )
									ret := 0.567010
								if( bbp > 0.001687 )
									ret := -0.037975
	if( Lower_Band > 0.065879 )
		if( bearPower <= 0.0001 )
			if( basis <= 0.11995 )
				if( basis <= 0.117826 )
					if( Lower_Band <= 0.066383 )
						if( bbp <= -0.000451 )
							if( Lower_Band <= 0.066248 )
								if( bearPower <= -0.000543 )
									ret := 0.109756
								if( bearPower > -0.000543 )
									ret := 0.627907
							if( Lower_Band > 0.066248 )
								if( bearPower <= -0.000574 )
									ret := 0.166667
								if( bearPower > -0.000574 )
									ret := -0.764706 // sell
						if( bbp > -0.000451 )
							if( bbm <= 0.000281 )
								if( Lower_Band <= 0.066248 )
									ret := -0.105895
								if( Lower_Band > 0.066248 )
									ret := -0.401674
							if( bbm > 0.000281 )
								if( basis <= 0.066969 )
									ret := 0.194737
								if( basis > 0.066969 )
									ret := -0.727273 // sell
					if( Lower_Band > 0.066383 )
						if( bbm <= 0.000859 )
							if( basis <= 0.117578 )
								if( basis <= 0.066709 )
									ret := 0.523810
								if( basis > 0.066709 )
									ret := 0.037833
							if( basis > 0.117578 )
								if( Upper_Band <= 0.119588 )
									ret := -0.763636 // sell
								if( Upper_Band > 0.119588 )
									ret := 1.000000 // buy
						if( bbm > 0.000859 )
							if( bearPower <= -0.00332 )
								if( Upper_Band <= 0.084258 )
									ret := -0.071429
								if( Upper_Band > 0.084258 )
									ret := -0.767442 // sell
							if( bearPower > -0.00332 )
								if( basis <= 0.112841 )
									ret := -0.090268
								if( basis > 0.112841 )
									ret := 0.250000
				if( basis > 0.117826 )
					if( bbm <= 0.000231 )
						if( Upper_Band <= 0.119882 )
							if( bearPower <= -0.000244 )
								if( bbp <= -0.000583 )
									ret := 0.000000
								if( bbp > -0.000583 )
									ret := -0.628571
							if( bearPower > -0.000244 )
								if( Lower_Band <= 0.116988 )
									ret := -1.000000 // sell
								if( Lower_Band > 0.116988 )
									ret := 0.073996
						if( Upper_Band > 0.119882 )
							if( basis <= 0.118938 )
								if( bbm <= 0.000153 )
									ret := 0.800000 // buy
								if( bbm > 0.000153 )
									ret := 1.000000 // buy
							if( basis > 0.118938 )
								if( bullPower <= 0.00013 )
									ret := 0.131034
								if( bullPower > 0.00013 )
									ret := 0.478723
					if( bbm > 0.000231 )
						if( Lower_Band <= 0.115982 )
							if( bearPower <= -0.001334 )
								if( bearPower <= -0.002816 )
									ret := -0.833333 // sell
								if( bearPower > -0.002816 )
									ret := 0.666667
							if( bearPower > -0.001334 )
								ret := -1.000000 // sell
						if( Lower_Band > 0.115982 )
							if( Lower_Band <= 0.118145 )
								if( bbp <= -0.004049 )
									ret := -0.285714
								if( bbp > -0.004049 )
									ret := 0.653846
							if( Lower_Band > 0.118145 )
								if( basis <= 0.118822 )
									ret := -0.218750
								if( basis > 0.118822 )
									ret := 0.330472
			if( basis > 0.11995 )
				if( bullPower <= -0.000163 )
					if( Upper_Band <= 0.141653 )
						if( basis <= 0.12088 )
							if( bbp <= -0.003802 )
								ret := 1.000000 // buy
							if( bbp > -0.003802 )
								if( Upper_Band <= 0.120932 )
									ret := -0.272727
								if( Upper_Band > 0.120932 )
									ret := -0.781609 // sell
						if( basis > 0.12088 )
							if( basis <= 0.121174 )
								if( Upper_Band <= 0.121715 )
									ret := -0.230769
								if( Upper_Band > 0.121715 )
									ret := 0.828571 // buy
							if( basis > 0.121174 )
								if( Upper_Band <= 0.122315 )
									ret := -0.742857 // sell
								if( Upper_Band > 0.122315 )
									ret := -0.257072
					if( Upper_Band > 0.141653 )
						if( bullPower <= -0.001353 )
							if( basis <= 0.160338 )
								if( Lower_Band <= 0.154272 )
									ret := -0.571429
								if( Lower_Band > 0.154272 )
									ret := -1.000000 // sell
							if( basis > 0.160338 )
								ret := 0.250000
						if( bullPower > -0.001353 )
							if( bbp <= -0.001601 )
								if( Lower_Band <= 0.148165 )
									ret := 0.909091 // buy
								if( Lower_Band > 0.148165 )
									ret := 0.207921
							if( bbp > -0.001601 )
								if( Lower_Band <= 0.139956 )
									ret := 0.800000 // buy
								if( Lower_Band > 0.139956 )
									ret := -0.096019
				if( bullPower > -0.000163 )
					if( Lower_Band <= 0.119289 )
						if( bbp <= -0.000327 )
							if( basis <= 0.120141 )
								ret := 0.857143 // buy
							if( basis > 0.120141 )
								if( Lower_Band <= 0.118224 )
									ret := 0.250000
								if( Lower_Band > 0.118224 )
									ret := -0.727273 // sell
						if( bbp > -0.000327 )
							if( bbp <= 0.000374 )
								if( Upper_Band <= 0.120926 )
									ret := -0.666667
								if( Upper_Band > 0.120926 )
									ret := -1.000000 // sell
							if( bbp > 0.000374 )
								ret := -0.500000
					if( Lower_Band > 0.119289 )
						if( basis <= 0.160472 )
							if( bbm <= 0.000506 )
								if( bearPower <= -0.000426 )
									ret := -0.186842
								if( bearPower > -0.000426 )
									ret := -0.006862
							if( bbm > 0.000506 )
								if( Upper_Band <= 0.125393 )
									ret := 0.354497
								if( Upper_Band > 0.125393 )
									ret := 0.034921
						if( basis > 0.160472 )
							if( bbm <= 0.000712 )
								if( bbp <= 0.000666 )
									ret := -0.178010
								if( bbp > 0.000666 )
									ret := 1.000000 // buy
							if( bbm > 0.000712 )
								if( Lower_Band <= 0.158649 )
									ret := 0.428571
								if( Lower_Band > 0.158649 )
									ret := -0.698113
		if( bearPower > 0.0001 )
			if( Lower_Band <= 0.100387 )
				if( bbp <= 0.000647 )
					if( Upper_Band <= 0.071011 )
						if( Lower_Band <= 0.069757 )
							if( basis <= 0.066811 )
								if( bbm <= 0.000175 )
									ret := -0.437500
								if( bbm > 0.000175 )
									ret := 0.160000
							if( basis > 0.066811 )
								if( Upper_Band <= 0.067557 )
									ret := 0.546667
								if( Upper_Band > 0.067557 )
									ret := 0.108466
						if( Lower_Band > 0.069757 )
							if( bbp <= 0.000506 )
								if( bbm <= 0.000129 )
									ret := 0.391304
								if( bbm > 0.000129 )
									ret := 0.888889 // buy
							if( bbp > 0.000506 )
								if( basis <= 0.070466 )
									ret := 0.250000
								if( basis > 0.070466 )
									ret := -1.000000 // sell
					if( Upper_Band > 0.071011 )
						if( bbm <= 7.4e-05 )
							if( Lower_Band <= 0.08608 )
								if( Lower_Band <= 0.071127 )
									ret := -0.714286 // sell
								if( Lower_Band > 0.071127 )
									ret := 0.124260
							if( Lower_Band > 0.08608 )
								if( Upper_Band <= 0.088095 )
									ret := 0.891892 // buy
								if( Upper_Band > 0.088095 )
									ret := -0.095238
						if( bbm > 7.4e-05 )
							if( Upper_Band <= 0.080255 )
								if( Lower_Band <= 0.070223 )
									ret := -0.348315
								if( Lower_Band > 0.070223 )
									ret := 0.058673
							if( Upper_Band > 0.080255 )
								if( Upper_Band <= 0.081869 )
									ret := -0.445378
								if( Upper_Band > 0.081869 )
									ret := -0.054146
				if( bbp > 0.000647 )
					if( Upper_Band <= 0.085009 )
						if( bearPower <= 0.000153 )
							if( Upper_Band <= 0.076308 )
								if( basis <= 0.074877 )
									ret := 0.557143
								if( basis > 0.074877 )
									ret := -0.166667
							if( Upper_Band > 0.076308 )
								if( Upper_Band <= 0.07781 )
									ret := -0.888889 // sell
								if( Upper_Band > 0.07781 )
									ret := 0.159420
						if( bearPower > 0.000153 )
							if( Lower_Band <= 0.079737 )
								if( bearPower <= 0.001564 )
									ret := -0.131480
								if( bearPower > 0.001564 )
									ret := 0.387097
							if( Lower_Band > 0.079737 )
								if( basis <= 0.080898 )
									ret := 0.830189 // buy
								if( basis > 0.080898 )
									ret := 0.066667
					if( Upper_Band > 0.085009 )
						if( bullPower <= 0.002407 )
							if( bbp <= 0.001077 )
								if( bbp <= 0.000695 )
									ret := 0.180000
								if( bbp > 0.000695 )
									ret := -0.318182
							if( bbp > 0.001077 )
								if( basis <= 0.083009 )
									ret := -0.166667
								if( basis > 0.083009 )
									ret := -0.843023 // sell
						if( bullPower > 0.002407 )
							if( Upper_Band <= 0.090028 )
								if( basis <= 0.083003 )
									ret := -0.900000 // sell
								if( basis > 0.083003 )
									ret := 0.500000
							if( Upper_Band > 0.090028 )
								if( bbp <= 0.004698 )
									ret := -1.000000 // sell
								if( bbp > 0.004698 )
									ret := -0.647059
			if( Lower_Band > 0.100387 )
				if( bbp <= 0.00096 )
					if( Upper_Band <= 0.103737 )
						if( bearPower <= 0.000346 )
							if( bbm <= 0.000184 )
								if( basis <= 0.101196 )
									ret := 0.896552 // buy
								if( basis > 0.101196 )
									ret := 0.222222
							if( bbm > 0.000184 )
								if( Lower_Band <= 0.101149 )
									ret := 0.000000
								if( Lower_Band > 0.101149 )
									ret := 0.760563 // buy
						if( bearPower > 0.000346 )
							if( Lower_Band <= 0.100521 )
								ret := -1.000000 // sell
							if( Lower_Band > 0.100521 )
								ret := -0.166667
					if( Upper_Band > 0.103737 )
						if( Lower_Band <= 0.102894 )
							if( bullPower <= 0.000264 )
								if( bbp <= 0.000337 )
									ret := 0.000000
								if( bbp > 0.000337 )
									ret := 0.833333 // buy
							if( bullPower > 0.000264 )
								if( basis <= 0.103333 )
									ret := -0.150000
								if( basis > 0.103333 )
									ret := -0.493151
						if( Lower_Band > 0.102894 )
							if( bbp <= 0.000427 )
								if( basis <= 0.109002 )
									ret := 0.169082
								if( basis > 0.109002 )
									ret := -0.046008
							if( bbp > 0.000427 )
								if( Upper_Band <= 0.159698 )
									ret := 0.132362
								if( Upper_Band > 0.159698 )
									ret := 0.392857
				if( bbp > 0.00096 )
					if( Lower_Band <= 0.124038 )
						if( basis <= 0.124453 )
							if( Upper_Band <= 0.125916 )
								if( Lower_Band <= 0.10178 )
									ret := -0.590909
								if( Lower_Band > 0.10178 )
									ret := 0.240994
							if( Upper_Band > 0.125916 )
								ret := 1.000000 // buy
						if( basis > 0.124453 )
							if( basis <= 0.125424 )
								if( bbp <= 0.001882 )
									ret := -0.588235
								if( bbp > 0.001882 )
									ret := -1.000000 // sell
							if( basis > 0.125424 )
								if( bearPower <= 0.000637 )
									ret := 0.750000 // buy
								if( bearPower > 0.000637 )
									ret := 0.000000
					if( Lower_Band > 0.124038 )
						if( basis <= 0.158213 )
							if( Upper_Band <= 0.141557 )
								if( bullPower <= 0.000965 )
									ret := 0.635556
								if( bullPower > 0.000965 )
									ret := -0.207547
							if( Upper_Band > 0.141557 )
								if( bearPower <= 0.000592 )
									ret := 0.575758
								if( bearPower > 0.000592 )
									ret := 0.804469 // buy
						if( basis > 0.158213 )
							if( Upper_Band <= 0.167017 )
								if( basis <= 0.159288 )
									ret := -0.294118
								if( basis > 0.159288 )
									ret := 0.324786
							if( Upper_Band > 0.167017 )
								if( bullPower <= 0.001058 )
									ret := -1.000000 // sell
								if( bullPower > 0.001058 )
									ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_TRXUSDT_15Min_ccec07ec(basis, Upper_Band, Lower_Band, bbm, bearPower, bbp, bullPower, BBPower_Color)

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


