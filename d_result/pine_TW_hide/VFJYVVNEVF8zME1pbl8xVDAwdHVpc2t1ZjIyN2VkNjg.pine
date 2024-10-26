//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TRXUSDT_30Min_1T00_f227ed68 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1T00_f227ed68", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_f227ed68(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 0.061474 )
		if( ema12 <= -0.000148 )
			if( tema <= 0.05998 )
				if( ema12 <= -0.001364 )
					if( ema1 <= 0.04665 )
						if( tema <= 0.034013 )
							if( ema13 <= -0.003285 )
								ret := 0.800000 // buy
							if( ema13 > -0.003285 )
								ret := 1.000000 // buy
						if( tema > 0.034013 )
							if( tema <= 0.038393 )
								ret := -1.000000 // sell
							if( tema > 0.038393 )
								if( ema2 <= 0.046868 )
									ret := 1.000000 // buy
								if( ema2 > 0.046868 )
									ret := -0.857143 // sell
					if( ema1 > 0.04665 )
						if( ema1 <= 0.060368 )
							if( ema13 <= -0.002386 )
								if( ema3 <= 0.05509 )
									ret := 0.722222 // buy
								if( ema3 > 0.05509 )
									ret := 0.938272 // buy
							if( ema13 > -0.002386 )
								if( ema13 <= -0.002275 )
									ret := -0.500000
								if( ema13 > -0.002275 )
									ret := 0.909091 // buy
						if( ema1 > 0.060368 )
							if( ema1 <= 0.062223 )
								if( ema3 <= 0.0661 )
									ret := 0.312500
								if( ema3 > 0.0661 )
									ret := 1.000000 // buy
							if( ema1 > 0.062223 )
								ret := 1.000000 // buy
				if( ema12 > -0.001364 )
					if( ema12 <= -0.000814 )
						if( tema <= 0.029087 )
							if( tema <= 0.028836 )
								ret := 1.000000 // buy
							if( tema > 0.028836 )
								ret := 0.750000 // buy
						if( tema > 0.029087 )
							if( ema13 <= -0.001644 )
								if( ema12 <= -0.000873 )
									ret := 0.119522
								if( ema12 > -0.000873 )
									ret := 1.000000 // buy
							if( ema13 > -0.001644 )
								if( ema12 <= -0.000885 )
									ret := -0.056818
								if( ema12 > -0.000885 )
									ret := -0.546667
					if( ema12 > -0.000814 )
						if( ema12 <= -0.000371 )
							if( ema3 <= 0.031435 )
								if( ema3 <= 0.03051 )
									ret := 0.445714
								if( ema3 > 0.03051 )
									ret := 0.847059 // buy
							if( ema3 > 0.031435 )
								if( tema <= 0.033637 )
									ret := -0.206667
								if( tema > 0.033637 )
									ret := 0.355124
						if( ema12 > -0.000371 )
							if( ema3 <= 0.060532 )
								if( ema13 <= -0.000277 )
									ret := 0.173971
								if( ema13 > -0.000277 )
									ret := 0.341113
							if( ema3 > 0.060532 )
								if( ema3 <= 0.060817 )
									ret := 0.830508 // buy
								if( ema3 > 0.060817 )
									ret := -0.571429
			if( tema > 0.05998 )
				if( ema3 <= 0.061249 )
					if( ema2 <= 0.060606 )
						if( ema13 <= -0.000297 )
							if( ema1 <= 0.060245 )
								if( ema1 <= 0.060115 )
									ret := 0.750000 // buy
								if( ema1 > 0.060115 )
									ret := 0.125000
							if( ema1 > 0.060245 )
								if( tema <= 0.060156 )
									ret := -0.888889 // sell
								if( tema > 0.060156 )
									ret := 0.000000
						if( ema13 > -0.000297 )
							if( ema12 <= -0.000161 )
								ret := 1.000000 // buy
							if( ema12 > -0.000161 )
								ret := 0.500000
					if( ema2 > 0.060606 )
						if( ema3 <= 0.060953 )
							if( ema2 <= 0.06081 )
								ret := -0.166667
							if( ema2 > 0.06081 )
								ret := 0.500000
						if( ema3 > 0.060953 )
							if( ema12 <= -0.00027 )
								if( ema13 <= -0.000487 )
									ret := -0.965517 // sell
								if( ema13 > -0.000487 )
									ret := -0.600000
							if( ema12 > -0.00027 )
								if( ema13 <= -0.000561 )
									ret := 0.142857
								if( ema13 > -0.000561 )
									ret := -0.714286 // sell
				if( ema3 > 0.061249 )
					if( ema13 <= -0.000388 )
						if( ema12 <= -0.000203 )
							if( ema2 <= 0.061821 )
								if( ema3 <= 0.061975 )
									ret := -0.033113
								if( ema3 > 0.061975 )
									ret := -0.614035
							if( ema2 > 0.061821 )
								if( ema12 <= -0.000552 )
									ret := -0.142857
								if( ema12 > -0.000552 )
									ret := 0.391753
						if( ema12 > -0.000203 )
							if( ema13 <= -0.000464 )
								if( ema1 <= 0.061053 )
									ret := -1.000000 // sell
								if( ema1 > 0.061053 )
									ret := 0.000000
							if( ema13 > -0.000464 )
								ret := -1.000000 // sell
					if( ema13 > -0.000388 )
						if( tema <= 0.06111 )
							if( ema3 <= 0.061357 )
								if( ema3 <= 0.061261 )
									ret := 0.200000
								if( ema3 > 0.061261 )
									ret := 0.842105 // buy
							if( ema3 > 0.061357 )
								if( ema13 <= -0.000223 )
									ret := -0.117647
								if( ema13 > -0.000223 )
									ret := 0.800000 // buy
						if( tema > 0.06111 )
							if( ema13 <= -0.00036 )
								if( ema12 <= -0.000269 )
									ret := 0.750000 // buy
								if( ema12 > -0.000269 )
									ret := 1.000000 // buy
							if( ema13 > -0.00036 )
								if( ema1 <= 0.061539 )
									ret := 0.937500 // buy
								if( ema1 > 0.061539 )
									ret := 0.421053
		if( ema12 > -0.000148 )
			if( ema13 <= 0.00054 )
				if( tema <= 0.025162 )
					if( tema <= 0.024027 )
						if( ema3 <= 0.024015 )
							if( tema <= 0.023455 )
								ret := 0.750000 // buy
							if( tema > 0.023455 )
								if( ema3 <= 0.023633 )
									ret := 0.750000 // buy
								if( ema3 > 0.023633 )
									ret := 1.000000 // buy
						if( ema3 > 0.024015 )
							if( ema2 <= 0.024012 )
								ret := 0.250000
							if( ema2 > 0.024012 )
								ret := 0.000000
					if( tema > 0.024027 )
						if( tema <= 0.024672 )
							if( ema3 <= 0.024278 )
								if( ema13 <= 0.000132 )
									ret := 0.322581
								if( ema13 > 0.000132 )
									ret := -0.739130 // sell
							if( ema3 > 0.024278 )
								if( ema3 <= 0.024744 )
									ret := -0.894737 // sell
								if( ema3 > 0.024744 )
									ret := 0.538462
						if( tema > 0.024672 )
							if( ema3 <= 0.025017 )
								if( ema13 <= 0.000193 )
									ret := 0.635514
								if( ema13 > 0.000193 )
									ret := 0.000000
							if( ema3 > 0.025017 )
								if( ema2 <= 0.02508 )
									ret := -0.158416
								if( ema2 > 0.02508 )
									ret := 0.561224
				if( tema > 0.025162 )
					if( ema1 <= 0.032331 )
						if( tema <= 0.031631 )
							if( ema13 <= -0.000194 )
								if( ema3 <= 0.026514 )
									ret := 0.391304
								if( ema3 > 0.026514 )
									ret := -0.213823
							if( ema13 > -0.000194 )
								if( ema3 <= 0.030713 )
									ret := 0.060674
								if( ema3 > 0.030713 )
									ret := 0.237828
						if( tema > 0.031631 )
							if( ema12 <= 9.4e-05 )
								if( ema3 <= 0.031876 )
									ret := -0.480000
								if( ema3 > 0.031876 )
									ret := -0.907407 // sell
							if( ema12 > 9.4e-05 )
								if( ema2 <= 0.031848 )
									ret := -0.250000
								if( ema2 > 0.031848 )
									ret := 0.471698
					if( ema1 > 0.032331 )
						if( tema <= 0.051048 )
							if( ema3 <= 0.035816 )
								if( ema2 <= 0.035738 )
									ret := 0.156404
								if( ema2 > 0.035738 )
									ret := -0.553571
							if( ema3 > 0.035816 )
								if( ema2 <= 0.047228 )
									ret := 0.573333
								if( ema2 > 0.047228 )
									ret := 0.253930
						if( tema > 0.051048 )
							if( tema <= 0.056092 )
								if( ema2 <= 0.055275 )
									ret := 0.063711
								if( ema2 > 0.055275 )
									ret := -0.229462
							if( tema > 0.056092 )
								if( ema3 <= 0.059211 )
									ret := 0.288476
								if( ema3 > 0.059211 )
									ret := 0.106027
			if( ema13 > 0.00054 )
				if( ema3 <= 0.036304 )
					if( ema1 <= 0.033516 )
						if( ema2 <= 0.031379 )
							if( tema <= 0.026722 )
								ret := 1.000000 // buy
							if( tema > 0.026722 )
								if( ema3 <= 0.027111 )
									ret := -0.900000 // sell
								if( ema3 > 0.027111 )
									ret := -0.178571
						if( ema2 > 0.031379 )
							if( ema13 <= 0.001124 )
								if( ema1 <= 0.032252 )
									ret := 0.760000 // buy
								if( ema1 > 0.032252 )
									ret := -0.326087
							if( ema13 > 0.001124 )
								if( tema <= 0.034141 )
									ret := 0.954545 // buy
								if( tema > 0.034141 )
									ret := 0.500000
					if( ema1 > 0.033516 )
						if( ema13 <= 0.0006 )
							if( ema2 <= 0.035541 )
								if( ema2 <= 0.033937 )
									ret := -0.769231 // sell
								if( ema2 > 0.033937 )
									ret := 0.708333 // buy
							if( ema2 > 0.035541 )
								ret := -1.000000 // sell
						if( ema13 > 0.0006 )
							if( ema12 <= 0.000308 )
								if( ema12 <= 0.00029 )
									ret := -0.750000 // sell
								if( ema12 > 0.00029 )
									ret := 0.000000
							if( ema12 > 0.000308 )
								if( ema13 <= 0.00065 )
									ret := -0.666667
								if( ema13 > 0.00065 )
									ret := -0.903509 // sell
				if( ema3 > 0.036304 )
					if( tema <= 0.040874 )
						if( ema2 <= 0.036983 )
							ret := 0.750000 // buy
						if( ema2 > 0.036983 )
							ret := 1.000000 // buy
					if( tema > 0.040874 )
						if( ema13 <= 0.002843 )
							if( ema13 <= 0.000908 )
								if( ema12 <= 0.000469 )
									ret := -0.033528
								if( ema12 > 0.000469 )
									ret := -0.415385
							if( ema13 > 0.000908 )
								if( ema12 <= 0.000556 )
									ret := 0.446701
								if( ema12 > 0.000556 )
									ret := -0.015306
						if( ema13 > 0.002843 )
							if( ema2 <= 0.053683 )
								ret := -1.000000 // sell
							if( ema2 > 0.053683 )
								ret := -0.500000
	if( tema > 0.061474 )
		if( ema12 <= 0.002133 )
			if( ema13 <= 0.002168 )
				if( ema12 <= 0.000884 )
					if( ema12 <= 0.000125 )
						if( tema <= 0.121115 )
							if( ema13 <= -0.000696 )
								if( ema2 <= 0.065221 )
									ret := -0.127660
								if( ema2 > 0.065221 )
									ret := 0.111324
							if( ema13 > -0.000696 )
								if( ema1 <= 0.121039 )
									ret := 0.007088
								if( ema1 > 0.121039 )
									ret := 0.557522
						if( tema > 0.121115 )
							if( ema13 <= -0.000152 )
								if( ema12 <= -0.001621 )
									ret := 0.079365
								if( ema12 > -0.001621 )
									ret := -0.161832
							if( ema13 > -0.000152 )
								if( ema12 <= -0.000145 )
									ret := -0.317073
								if( ema12 > -0.000145 )
									ret := -0.024146
					if( ema12 > 0.000125 )
						if( ema3 <= 0.111548 )
							if( ema13 <= 0.00062 )
								if( ema2 <= 0.109342 )
									ret := 0.077798
								if( ema2 > 0.109342 )
									ret := -0.356061
							if( ema13 > 0.00062 )
								if( tema <= 0.071603 )
									ret := 0.060481
								if( tema > 0.071603 )
									ret := -0.078779
						if( ema3 > 0.111548 )
							if( ema13 <= 0.000548 )
								if( ema1 <= 0.165343 )
									ret := 0.054054
								if( ema1 > 0.165343 )
									ret := 1.000000 // buy
							if( ema13 > 0.000548 )
								if( tema <= 0.113517 )
									ret := 0.777778 // buy
								if( tema > 0.113517 )
									ret := 0.178441
				if( ema12 > 0.000884 )
					if( ema2 <= 0.122905 )
						if( ema1 <= 0.110997 )
							if( ema2 <= 0.07529 )
								if( ema3 <= 0.069673 )
									ret := -0.081081
								if( ema3 > 0.069673 )
									ret := -0.734043 // sell
							if( ema2 > 0.07529 )
								if( ema3 <= 0.077505 )
									ret := 0.493151
								if( ema3 > 0.077505 )
									ret := -0.194521
						if( ema1 > 0.110997 )
							if( ema12 <= 0.001024 )
								if( ema2 <= 0.121601 )
									ret := -0.052632
								if( ema2 > 0.121601 )
									ret := -0.846154 // sell
							if( ema12 > 0.001024 )
								if( ema1 <= 0.119963 )
									ret := -0.528571
								if( ema1 > 0.119963 )
									ret := -0.857143 // sell
					if( ema2 > 0.122905 )
						if( ema12 <= 0.001519 )
							if( ema13 <= 0.001932 )
								if( ema13 <= 0.001594 )
									ret := 0.212766
								if( ema13 > 0.001594 )
									ret := 0.515789
							if( ema13 > 0.001932 )
								if( ema12 <= 0.001226 )
									ret := -0.111111
								if( ema12 > 0.001226 )
									ret := 0.800000 // buy
						if( ema12 > 0.001519 )
							if( ema2 <= 0.130081 )
								ret := -0.500000
							if( ema2 > 0.130081 )
								ret := -1.000000 // sell
			if( ema13 > 0.002168 )
				if( ema1 <= 0.161321 )
					if( ema1 <= 0.1456 )
						if( ema1 <= 0.143678 )
							if( ema1 <= 0.14004 )
								if( tema <= 0.083787 )
									ret := 0.341880
								if( tema > 0.083787 )
									ret := 0.029032
							if( ema1 > 0.14004 )
								if( ema1 <= 0.143268 )
									ret := 0.973684 // buy
								if( ema1 > 0.143268 )
									ret := 0.333333
						if( ema1 > 0.143678 )
							if( ema3 <= 0.141712 )
								if( ema3 <= 0.140826 )
									ret := -0.857143 // sell
								if( ema3 > 0.140826 )
									ret := -1.000000 // sell
							if( ema3 > 0.141712 )
								ret := -0.666667
					if( ema1 > 0.1456 )
						if( ema12 <= 0.001683 )
							if( tema <= 0.151926 )
								ret := 1.000000 // buy
							if( tema > 0.151926 )
								if( tema <= 0.152905 )
									ret := 0.272727
								if( tema > 0.152905 )
									ret := 0.789474 // buy
						if( ema12 > 0.001683 )
							if( ema2 <= 0.146456 )
								ret := 1.000000 // buy
							if( ema2 > 0.146456 )
								if( ema13 <= 0.003577 )
									ret := -0.666667
								if( ema13 > 0.003577 )
									ret := 0.452381
				if( ema1 > 0.161321 )
					if( ema13 <= 0.002718 )
						if( ema2 <= 0.160902 )
							ret := 0.750000 // buy
						if( ema2 > 0.160902 )
							ret := -0.833333 // sell
					if( ema13 > 0.002718 )
						if( ema13 <= 0.002927 )
							ret := -1.000000 // sell
						if( ema13 > 0.002927 )
							if( ema2 <= 0.160086 )
								ret := -1.000000 // sell
							if( ema2 > 0.160086 )
								if( tema <= 0.171583 )
									ret := 0.166667
								if( tema > 0.171583 )
									ret := -1.000000 // sell
		if( ema12 > 0.002133 )
			if( ema2 <= 0.128347 )
				if( ema1 <= 0.119053 )
					if( ema1 <= 0.084974 )
						if( ema2 <= 0.06502 )
							if( ema13 <= 0.004208 )
								if( ema13 <= 0.003634 )
									ret := -1.000000 // sell
								if( ema13 > 0.003634 )
									ret := -0.750000 // sell
							if( ema13 > 0.004208 )
								ret := -0.200000
						if( ema2 > 0.06502 )
							if( ema2 <= 0.077115 )
								if( ema3 <= 0.07319 )
									ret := 0.800000 // buy
								if( ema3 > 0.07319 )
									ret := -1.000000 // sell
							if( ema2 > 0.077115 )
								if( ema13 <= 0.004553 )
									ret := 0.500000
								if( ema13 > 0.004553 )
									ret := 1.000000 // buy
					if( ema1 > 0.084974 )
						if( ema2 <= 0.090321 )
							if( ema3 <= 0.080599 )
								ret := -0.333333
							if( ema3 > 0.080599 )
								if( ema12 <= 0.00216 )
									ret := -0.500000
								if( ema12 > 0.00216 )
									ret := -0.979592 // sell
						if( ema2 > 0.090321 )
							if( ema1 <= 0.10269 )
								ret := 1.000000 // buy
							if( ema1 > 0.10269 )
								if( ema2 <= 0.107227 )
									ret := 0.050000
								if( ema2 > 0.107227 )
									ret := -0.733333 // sell
				if( ema1 > 0.119053 )
					if( ema12 <= 0.002217 )
						ret := -0.500000
					if( ema12 > 0.002217 )
						if( tema <= 0.133283 )
							if( tema <= 0.128804 )
								if( ema12 <= 0.002259 )
									ret := 0.500000
								if( ema12 > 0.002259 )
									ret := 0.857143 // buy
							if( tema > 0.128804 )
								ret := -1.000000 // sell
						if( tema > 0.133283 )
							if( ema12 <= 0.005108 )
								if( ema2 <= 0.12617 )
									ret := 0.875000 // buy
								if( ema2 > 0.12617 )
									ret := 1.000000 // buy
							if( ema12 > 0.005108 )
								ret := 0.500000
			if( ema2 > 0.128347 )
				if( ema12 <= 0.002729 )
					if( ema2 <= 0.134978 )
						if( tema <= 0.137654 )
							if( ema3 <= 0.129177 )
								if( ema12 <= 0.00237 )
									ret := -1.000000 // sell
								if( ema12 > 0.00237 )
									ret := -0.750000 // sell
							if( ema3 > 0.129177 )
								ret := -0.500000
						if( tema > 0.137654 )
							ret := -1.000000 // sell
					if( ema2 > 0.134978 )
						if( ema3 <= 0.137407 )
							if( tema <= 0.143027 )
								ret := 1.000000 // buy
							if( tema > 0.143027 )
								if( ema3 <= 0.136802 )
									ret := -0.500000
								if( ema3 > 0.136802 )
									ret := 0.857143 // buy
						if( ema3 > 0.137407 )
							if( ema13 <= 0.003714 )
								if( ema3 <= 0.143001 )
									ret := 1.000000 // buy
								if( ema3 > 0.143001 )
									ret := 0.000000
							if( ema13 > 0.003714 )
								if( ema13 <= 0.005378 )
									ret := -0.486486
								if( ema13 > 0.005378 )
									ret := 1.000000 // buy
				if( ema12 > 0.002729 )
					if( ema3 <= 0.15689 )
						if( ema12 <= 0.003414 )
							if( ema13 <= 0.005819 )
								if( ema1 <= 0.15163 )
									ret := -1.000000 // sell
								if( ema1 > 0.15163 )
									ret := -0.750000 // sell
							if( ema13 > 0.005819 )
								ret := -0.500000
						if( ema12 > 0.003414 )
							if( ema2 <= 0.154427 )
								ret := -1.000000 // sell
							if( ema2 > 0.154427 )
								if( ema3 <= 0.152305 )
									ret := -0.750000 // sell
								if( ema3 > 0.152305 )
									ret := -1.000000 // sell
					if( ema3 > 0.15689 )
						if( ema1 <= 0.169818 )
							ret := 0.857143 // buy
						if( ema1 > 0.169818 )
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
float op_operation = decision_tree_0_TRXUSDT_30Min_f227ed68(ema1, tema, ema12, ema2, ema3, ema13)

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


